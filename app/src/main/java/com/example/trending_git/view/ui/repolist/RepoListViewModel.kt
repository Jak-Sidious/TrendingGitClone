package com.example.trending_git.view.ui.repolist

import android.content.ClipData
import androidx.lifecycle.MutableLiveData
import com.example.trending_git.view.base.BaseViewModel
import com.example.trending_git.view.model.RepoRepository

class RepoListViewModel : BaseViewModel(){

    val repoListLive = MutableLiveData<List<ClipData.Item>>()

    fun fetchRepoList() {
        dataLoading.value = true
        RepoRepository.getInstance().getRepoList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                repoListLive.value = response?.items
                empty.value = false
            } else {
                empty.value = true
            }
        }
    }
}