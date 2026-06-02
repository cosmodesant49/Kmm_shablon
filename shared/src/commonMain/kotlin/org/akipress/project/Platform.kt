package org.akipress.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform