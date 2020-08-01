package com.benrostudios.node_notes.di

import com.benrostudios.node_notes.di.modules.networkModules
import com.benrostudios.node_notes.di.modules.repositoryModules

val appComponent = listOf(
    networkModules,
    repositoryModules
)