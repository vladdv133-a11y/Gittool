package sa.studio.dgitandroid

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.eclipse.jgit.api.Git
import java.io.File
import android.os.Environment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GitCloneScreen()
                }
            }
        }
    }
}

@Composable
fun GitCloneScreen() {
    var url by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("Ready") }
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = url,
            onValueChange = { url = it },
            label = { Text("Repository URL") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                status = "Cloning..."
                scope.launch(Dispatchers.IO) {
                    try {
                        val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                        val targetFolder = File(downloadsDir, "DGitAndroid_${System.currentTimeMillis()}")

                        Git.cloneRepository()
                            .setURI(url)
                            .setDirectory(targetFolder)
                            .call()

                        status = "Success! Saved in Downloads"
                    } catch (e: Exception) {
                        status = "Error: ${e.localizedMessage}"
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Clone Repository")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = status)
    }
}