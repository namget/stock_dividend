package com.namget.stock.know.dividend.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.namget.stock.know.dividend.BR

abstract class BaseFragment<B : ViewDataBinding>(
    @LayoutRes
    private val layoutRes: Int
) : Fragment() {

    protected lateinit var binding: B

    abstract val viewModel: ViewModel?

    abstract fun init()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        binding.lifecycleOwner = this
        viewModel?.let {
            binding.setVariable(BR.viewModel, viewModel)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
}