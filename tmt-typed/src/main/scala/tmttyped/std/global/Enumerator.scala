package tmttyped.std.global

import tmttyped.std.EnumeratorConstructor
import tmttyped.std.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Enumerator")
@js.native
open class Enumerator[T] protected ()
  extends StObject
     with tmttyped.std.Enumerator[T] {
  /* standard ScriptHost */
  def this(collection: Any) = this()
  /* standard ScriptHost */
  def this(collection: Item[T]) = this()
  /* standard ScriptHost */
  def this(safearray: tmttyped.std.SafeArray[T]) = this()
  
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  /* standard ScriptHost */
  /* CompleteClass */
  override def atEnd(): scala.Boolean = js.native
  
  /**
    * Returns the current item in the collection
    */
  /* standard ScriptHost */
  /* CompleteClass */
  override def item(): T = js.native
  
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  /* standard ScriptHost */
  /* CompleteClass */
  override def moveFirst(): Unit = js.native
  
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  /* standard ScriptHost */
  /* CompleteClass */
  override def moveNext(): Unit = js.native
}
object Enumerator {
  
  inline def apply: EnumeratorConstructor = js.Dynamic.global.selectDynamic("Enumerator").asInstanceOf[EnumeratorConstructor]
}
