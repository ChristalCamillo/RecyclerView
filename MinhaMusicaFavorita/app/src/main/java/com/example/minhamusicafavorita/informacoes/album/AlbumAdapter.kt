package com.example.minhamusicafavorita.informacoes.album

import Model.Album
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.minhamusicafavorita.databinding.AlbumItemBinding

class AlbumAdapter(
    private var listaAlbum: MutableList<Album>): RecyclerView.Adapter<AlbumAdapter.ViewHolder>()
{
// vinculo a VIEW ao layout ALBUM ITEM e retorno a instancia ao viewholder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
// o que quero mostrar? os albuns (meus itensd da lista)
    class ViewHolder(val binding: AlbumItemBinding) :RecyclerView.ViewHolder(binding.root){
        fun exibirdadosItemLista(album: Album){
            binding.ivAlbum.album.getImage()
        }
    }

    // TODO: CRIAR CLASSE ATUALIZAR LISTA
}