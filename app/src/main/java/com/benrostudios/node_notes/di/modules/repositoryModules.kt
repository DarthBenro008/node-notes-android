package com.benrostudios.node_notes.di.modules


import com.benrostudios.node_notes.data.repo.AuthRepo
import com.benrostudios.node_notes.data.repo.AuthRepoImpl
import com.benrostudios.node_notes.data.repo.NotesRepo
import com.benrostudios.node_notes.data.repo.NotesRepoImpl
import org.koin.dsl.module

val repositoryModules = module{
    single<AuthRepo>{AuthRepoImpl()}
    single<NotesRepo>{NotesRepoImpl()}

}