package tmttyped.std.global

import tmttyped.std.ClipboardItemDataType
import tmttyped.std.ClipboardItemOptions
import tmttyped.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ClipboardItem")
@js.native
class ClipboardItem protected ()
  extends StObject
     with tmttyped.std.ClipboardItem {
  /* standard DOM */
  def this(items: Record[java.lang.String, ClipboardItemDataType | js.Thenable[ClipboardItemDataType]]) = this()
  def this(
    items: Record[java.lang.String, ClipboardItemDataType | js.Thenable[ClipboardItemDataType]],
    options: ClipboardItemOptions
  ) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override def getType(`type`: java.lang.String): js.Promise[org.scalajs.dom.Blob] = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val types: js.Array[java.lang.String] = js.native
}
