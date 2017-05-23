import java.util.*

/**
 * Created by Silas on 23.05.2017.
 */

abstract class AbstractGroundTruth{

    val list: ArrayList<Paper>

    init {
        list = ArrayList()
        buildList()
    }

    protected abstract fun buildList()

    abstract fun printCSV()

}