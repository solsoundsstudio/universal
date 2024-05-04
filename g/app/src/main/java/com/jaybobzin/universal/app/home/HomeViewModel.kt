package com.jaybobzin.universal.app.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jaybobzin.universal.common.repository.UniversalRepositoryInterface
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn


data class HomeUiState(
    val items: List<String> = emptyList(),
    val isLoading: Boolean = false,
    val userMessage: Int? = null
)

class HomeViewModel(
    private val universalRepository: UniversalRepositoryInterface
) : ViewModel() {

    val uiState = flowOf(universalRepository.hello()).map { HomeUiState(it) }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(),
        HomeUiState(isLoading = true)
    )

    fun refresh() { }
}
