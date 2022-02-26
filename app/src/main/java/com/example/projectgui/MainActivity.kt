package com.example.projectgui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectgui.ui.theme.ProjectGUITheme

val DarkYellow = Color(0xFFF5C518)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Composable
fun Bienvenida() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = DarkYellow)
    ) {
        Text(text = "UPDb",
            fontSize = 80.sp,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(top = 100.dp)
        )
        Image(
            painter = painterResource(R.drawable.logo_updb),
            contentDescription = "profilePic",
            modifier = Modifier
                .size(180.dp)
                .padding(top = 60.dp),
            alignment = Alignment.Center
        )
        Text(
            text = "DESCUBRE LAS MEJORES RECOMENDACIONES EN SERIES Y PELÍCULAS",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 75.dp)
        )
        Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                modifier = Modifier
                    .padding(top = 85.dp)
                    .size(width = 200.dp, height = 55.dp),
                shape = RoundedCornerShape(corner = CornerSize(10.dp)),
            ) {
            Text(text = "Iniciar", color = DarkYellow, fontSize = 25.sp)
        }
    }
}

@Composable
fun SignUp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = DarkYellow)
    ) {
        Image(
            painter = painterResource(R.drawable.logo_updb),
            contentDescription = "profilePic",
            modifier = Modifier
                .size(175.dp)
                .padding(top = 80.dp),
            alignment = Alignment.Center
        )
        Column {
            Card(modifier = Modifier
                .padding(top = 80.dp)
                .padding(start = 20.dp)
                .size(width = 250.dp, height = 50.dp),
                shape = RoundedCornerShape(corner = CornerSize(10.dp))
            ) {
                Text(text = "Correo", modifier = Modifier
                    .padding(top = 12.dp)
                    .padding(start = 15.dp),
                    color = Color.LightGray
                )
            }
            Card(modifier = Modifier
                .padding(20.dp)
                .size(width = 250.dp, height = 50.dp),
                RoundedCornerShape(corner = CornerSize(10.dp))
            ) {
                Text(text = "Contraseña", modifier = Modifier
                    .padding(top = 12.dp)
                    .padding(start = 15.dp),
                    color = Color.LightGray
                )
            }
            Card(modifier = Modifier
                .padding(start = 20.dp)
                .size(width = 250.dp, height = 50.dp),
                RoundedCornerShape(corner = CornerSize(10.dp))
            ) {
                Text(text = "Confirmación de contraseña", modifier = Modifier
                    .padding(top = 12.dp)
                    .padding(start = 15.dp),
                    color = Color.LightGray
                )
            }
        }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            modifier = Modifier
                .padding(top = 100.dp)
                .size(width = 250.dp, height = 50.dp),
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        ) {
            Text(text = "Registrarse", color = Color.Black, fontSize = 22.sp)
        }
        Row {

            Text(text = "O", textAlign = TextAlign.Center, color = Color.White, modifier = Modifier.padding(top = 10.dp))
        }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            modifier = Modifier
                .padding(top = 10.dp)
                .size(width = 250.dp, height = 50.dp),
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        ) {
            Image(
                painter = painterResource(R.drawable.google_icon),
                contentDescription = "profilePic",
                modifier = Modifier
                    .size(30.dp),
                alignment = Alignment.Center
            )
        }
        Row (modifier = Modifier.padding(top = 15.dp)) {
            Text(text = "¿Ya tienes cuenta?  ")
            Text(text = "Inicia sesión", color = Color.White)
        }
    }
}

@Composable
fun LogIn() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = DarkYellow)
    ) {
        Image(
            painter = painterResource(R.drawable.logo_updb),
            contentDescription = "profilePic",
            modifier = Modifier
                .size(175.dp)
                .padding(top = 80.dp),
            alignment = Alignment.Center
        )
        Column {
            Card(modifier = Modifier
                .padding(top = 80.dp)
                .padding(start = 20.dp)
                .size(width = 250.dp, height = 50.dp),
                shape = RoundedCornerShape(corner = CornerSize(10.dp))
            ) {
                Text(text = "Correo", modifier = Modifier
                    .padding(top = 12.dp)
                    .padding(start = 15.dp),
                    color = Color.LightGray
                )
            }
            Card(modifier = Modifier
                .padding(20.dp)
                .size(width = 250.dp, height = 50.dp),
                RoundedCornerShape(corner = CornerSize(10.dp))
            ) {
                Text(text = "Contraseña", modifier = Modifier
                    .padding(top = 12.dp)
                    .padding(start = 15.dp),
                    color = Color.LightGray
                )
            }
            Text(text = "¿Olvidaste tu constraseña?", color = Color.White, modifier = Modifier.padding(start = 85.dp))
        }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            modifier = Modifier
                .padding(top = 130.dp)
                .size(width = 250.dp, height = 50.dp),
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        ) {
            Text(text = "Iniciar Sesión", color = Color.Black, fontSize = 22.sp)
        }
        Row {

            Text(text = "O", textAlign = TextAlign.Center, color = Color.White, modifier = Modifier.padding(top = 10.dp))
        }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            modifier = Modifier
                .padding(top = 10.dp)
                .size(width = 250.dp, height = 50.dp),
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        ) {
            Image(
                painter = painterResource(R.drawable.google_icon),
                contentDescription = "profilePic",
                modifier = Modifier
                    .size(30.dp),
                alignment = Alignment.Center
            )
        }
        Row (modifier = Modifier.padding(top = 15.dp)) {
            Text(text = "¿No eres miembro?  ")
            Text(text = "Regístrate", color = Color.White)
        }
    }
}

@Composable
fun Sidebar() {
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .width(350.dp)
            .background(color = DarkYellow)
            ) {
        Row (modifier = Modifier.width(350.dp)) {
            Text(text = "UPDb",
                fontSize = 50.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(top = 30.dp, start = 30.dp),
            )
            Image(
                painter = painterResource(R.drawable.hamburguer_menu),
                contentDescription = "sideBarIcon",
                modifier = Modifier
                    .size(155.dp)
                    .padding(start = 130.dp, top = 45.dp)
                ,
                alignment = Alignment.TopEnd
            )
        }
        SidebarSection(textToRender = "Noticias", imgName = R.drawable.news_icon)
        SidebarSection(textToRender = "Top películas", imgName = R.drawable.top_icon)
        SidebarSection(textToRender = "Recomendaciones", imgName = R.drawable.recom_icon)
        SidebarSection(textToRender = "Watched", imgName = R.drawable.watched_icon)
        SidebarSection(textToRender = "WatchList", imgName = R.drawable.watchlist_icon)
        SidebarSection(textToRender = "Perfil", imgName = R.drawable.profile_icon)
        SidebarSection(textToRender = "Feedback", imgName = R.drawable.feedback_icon)

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
            modifier = Modifier
                .padding(top = 65.dp)
                .size(width = 200.dp, height = 55.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        ) {
            Text(text = "Cerrar sesión", color = DarkYellow, fontSize = 20.sp)
        }
    }
}

@Composable
fun SidebarSection(textToRender: String, imgName: Int) {
    Row (modifier = Modifier.height(60.dp)) {
        Image(
            painter = painterResource(imgName),
            contentDescription = "profilePic",
            modifier = Modifier
                .size(60.dp)
                .padding(start = 40.dp)
        )
        Text(text = textToRender, fontSize = 20.sp, modifier = Modifier.padding(top = 14.dp, start = 40.dp))
    }
    Divider(modifier = Modifier.padding(top = 1.dp), thickness = 2.dp)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProjectGUITheme {
        //Bienvenida()
        //SignUp()
        //LogIn()
        Sidebar()
    }
}