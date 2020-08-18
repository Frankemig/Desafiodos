package cl.desafiolatam.desafiodos.orm

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task (@ColumnInfo(name="Long") var text:String) {
    @PrimaryKey(autoGenerate = true)
    var id:Long? = null
}