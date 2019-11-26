package com.example.vdmoviesapp.data.remote.model

import com.example.vdmoviesapp.data.local.entity.TvEntity

data class TvApiResponse(
    val page: Long,
    val results: List<TvEntity>,
    val total_results: Long,
    val total_pages: Long
)