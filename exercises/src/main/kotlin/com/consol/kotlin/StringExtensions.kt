package com.consol.kotlin


fun String.barkify(): String {
    return this.split(" ").map { word -> "Wuff" }.joinToString(" ");
}