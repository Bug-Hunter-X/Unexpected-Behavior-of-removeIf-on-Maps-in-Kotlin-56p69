# Unexpected Behavior of removeIf on Maps in Kotlin

This repository demonstrates a subtle, yet potentially confusing behavior when using the `removeIf` function on Kotlin collections, specifically maps.

The `bug.kt` file showcases the unexpected behavior where removing elements based on values from a map's entries using `removeIf` might not immediately remove elements causing confusion for someone new to Kotlin's collection methods.