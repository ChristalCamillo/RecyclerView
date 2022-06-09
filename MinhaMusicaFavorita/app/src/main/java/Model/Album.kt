package Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Album(private var imagem: Int,
            private var nome: String): Parcelable {

    fun getImage() = this.imagem
    fun getNome() = this.nome
}