package com.example.minhamusicafavorita.informacoes.album

import Model.Album
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.minhamusicafavorita.R
import com.example.minhamusicafavorita.databinding.FragmentAlbumBinding


class AlbumFragment : Fragment() {
    private lateinit var binding: FragmentAlbumBinding

    //inicializando com lista vazia
    private val albumAdapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAlbumBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun criarListaAlbum(){
        val listaAlbum = mutableListOf<Album>()

        listaAlbum.add(Album(R.drawable.s10_image,"DeDipte"))

        albumAdapter.atualizar
    }
}
