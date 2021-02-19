package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Range")
@js.native
class Range ()
  extends tmttyped.std.Range {
  
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  
  /**
    * Returns range's end node.
    */
  /* CompleteClass */
  override val endContainer: org.scalajs.dom.raw.Node = js.native
  
  /**
    * Returns range's end offset.
    */
  /* CompleteClass */
  override val endOffset: Double = js.native
  
  /**
    * Returns range's start node.
    */
  /* CompleteClass */
  override val startContainer: org.scalajs.dom.raw.Node = js.native
  
  /**
    * Returns range's start offset.
    */
  /* CompleteClass */
  override val startOffset: Double = js.native
}
object Range {
  
  @JSGlobal("Range.END_TO_END")
  @js.native
  val END_TO_END: Double = js.native
  
  @JSGlobal("Range.END_TO_START")
  @js.native
  val END_TO_START: Double = js.native
  
  @JSGlobal("Range.START_TO_END")
  @js.native
  val START_TO_END: Double = js.native
  
  @JSGlobal("Range.START_TO_START")
  @js.native
  val START_TO_START: Double = js.native
  
  @JSGlobal("Range.toString")
  @js.native
  def toString_(): java.lang.String = js.native
}
