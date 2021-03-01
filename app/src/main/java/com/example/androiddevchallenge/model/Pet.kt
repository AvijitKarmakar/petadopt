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
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

data class Pet(
    var id: Int = 0,
    var name: String = "",
    var type: String = "",
    var image: Int = 0,
    var description: Int = 0
)

val pets = listOf(
    Pet(1, "Dexter", "French Bulldog", R.drawable.ic_bulldog, R.string.desc_bulldog),
    Pet(2, "Winter", "Siberian Husky", R.drawable.ic_husky, R.string.desc_husky),
    Pet(
        3,
        "Rosie",
        "Golden Retriever",
        R.drawable.ic_golden_retriever,
        R.string.desc_golden_retriever
    ),
    Pet(4, "Suzie", "Beagle Dog", R.drawable.ic_beagle, R.string.desc_beagle),
    Pet(5, "Dexter", "French Bulldog", R.drawable.ic_bulldog, R.string.desc_bulldog),
    Pet(6, "Winter", "Siberian Husky", R.drawable.ic_husky, R.string.desc_husky),
    Pet(
        7,
        "Rosie",
        "Golden Retriever",
        R.drawable.ic_golden_retriever,
        R.string.desc_golden_retriever
    ),
    Pet(8, "Suzie", "Beagle Dog", R.drawable.ic_beagle, R.string.desc_beagle),
    Pet(9, "Dexter", "French Bulldog", R.drawable.ic_bulldog, R.string.desc_bulldog),
    Pet(10, "Winter", "Siberian Husky", R.drawable.ic_husky, R.string.desc_husky),
    Pet(
        11,
        "Rosie",
        "Golden Retriever",
        R.drawable.ic_golden_retriever,
        R.string.desc_golden_retriever
    ),
    Pet(12, "Suzie", "Beagle Dog", R.drawable.ic_beagle, R.string.desc_beagle),
    Pet(13, "Dexter", "French Bulldog", R.drawable.ic_bulldog, R.string.desc_bulldog),
    Pet(14, "Winter", "Siberian Husky", R.drawable.ic_husky, R.string.desc_husky),
    Pet(
        15,
        "Rosie",
        "Golden Retriever",
        R.drawable.ic_golden_retriever,
        R.string.desc_golden_retriever
    ),
    Pet(16, "Suzie", "Beagle Dog", R.drawable.ic_beagle, R.string.desc_beagle),
    Pet(17, "Dexter", "French Bulldog", R.drawable.ic_bulldog, R.string.desc_bulldog),
    Pet(18, "Winter", "Siberian Husky", R.drawable.ic_husky, R.string.desc_husky),
    Pet(
        19,
        "Rosie",
        "Golden Retriever",
        R.drawable.ic_golden_retriever,
        R.string.desc_golden_retriever
    ),
    Pet(20, "Suzie", "Beagle Dog", R.drawable.ic_beagle, R.string.desc_beagle),
    Pet(21, "Dexter", "French Bulldog", R.drawable.ic_bulldog, R.string.desc_bulldog),
    Pet(22, "Winter", "Siberian Husky", R.drawable.ic_husky, R.string.desc_husky),
    Pet(
        23,
        "Rosie",
        "Golden Retriever",
        R.drawable.ic_golden_retriever,
        R.string.desc_golden_retriever
    ),
    Pet(24, "Suzie", "Beagle Dog", R.drawable.ic_beagle, R.string.desc_beagle)
)
