package com.example.cleanzaets

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanzaets.databinding.ViewHolderBannedPostBinding
import com.example.cleanzaets.presenter.PostUiModel

class BannedPostViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding: ViewHolderBannedPostBinding by lazy {
        ViewHolderBannedPostBinding.bind(view)
    }

    fun onBind(bannedPost: PostUiModel.BannedPost) {
        binding.apply {
            clContainer.setBackgroundColor(bannedPost.backgroundColor)
            tvWarning.text = bannedPost.warningText
        }
    }
}