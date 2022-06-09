package com.example.minhamusicafavorita.informacoes.informacoes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class InformacoesPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private var listaAlbuns: List<String>
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = listaAlbuns.size
    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }

    //override fun createFragment(position: Int): Fragment {
        //when (position) {
            // 0 -> return InformacoesFragment()
            //1 -> return AlbunsFragment()
//        }

        //return FilmeFragment()
}