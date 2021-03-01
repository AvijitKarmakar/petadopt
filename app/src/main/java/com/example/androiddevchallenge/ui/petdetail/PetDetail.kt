/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.petdetail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.pets
import com.example.androiddevchallenge.ui.theme.purple200

@Composable
fun PetDetailScreen(id: Int) {
    val pet = pets[id - 1]

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .size(100.dp)
                .fillMaxWidth()
                .fillMaxHeight()
                .align(Alignment.CenterHorizontally),
            shape = CircleShape,
            elevation = 2.dp
        ) {
            Image(
                painter = painterResource(id = pet.image),
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
                contentDescription = ""
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .border(
                        BorderStroke(1.dp, Color.Gray),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .padding(10.dp)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Name",
                    fontSize = 13.sp
                )
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = pet.name,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column(
                Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .border(
                        BorderStroke(1.dp, Color.Gray),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .padding(10.dp)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Type",
                    fontSize = 13.sp
                )
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = pet.type,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            Text(
                text = "Description",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = stringResource(id = pet.description),
                fontSize = 15.sp,
                lineHeight = 24.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = purple200
            )
        ) {
            Text(
                text = "Adopt",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}
