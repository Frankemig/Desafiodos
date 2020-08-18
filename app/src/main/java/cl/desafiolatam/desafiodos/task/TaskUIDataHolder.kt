package cl.desafiolatam.desafiodos.task

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskUIDataHolder (@ColumnInfo(name="Long") var text:String) {
@PrimaryKey(autoGenerate = true)
var id:Long? = null
}
