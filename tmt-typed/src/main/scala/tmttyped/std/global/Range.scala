package tmttyped.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Range")
@js.native
/* standard DOM */
class Range ()
  extends StObject
     with tmttyped.std.Range {
  
  /** Returns true if range is collapsed, and false otherwise. */
  /* standard DOM */
  /* CompleteClass */
  override val collapsed: scala.Boolean = js.native
  
  /** Returns range's end node. */
  /* standard DOM */
  /* CompleteClass */
  override val endContainer: org.scalajs.dom.Node = js.native
  
  /** Returns range's end offset. */
  /* standard DOM */
  /* CompleteClass */
  override val endOffset: Double = js.native
  
  /** Returns range's start node. */
  /* standard DOM */
  /* CompleteClass */
  override val startContainer: org.scalajs.dom.Node = js.native
  
  /** Returns range's start offset. */
  /* standard DOM */
  /* CompleteClass */
  override val startOffset: Double = js.native
}
object Range {
  
  @JSGlobal("Range")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard DOM */
  @JSGlobal("Range.END_TO_END")
  @js.native
  val END_TO_END: Double = js.native
  
  /* standard DOM */
  @JSGlobal("Range.END_TO_START")
  @js.native
  val END_TO_START: Double = js.native
  
  /* standard DOM */
  @JSGlobal("Range.START_TO_END")
  @js.native
  val START_TO_END: Double = js.native
  
  /* standard DOM */
  @JSGlobal("Range.START_TO_START")
  @js.native
  val START_TO_START: Double = js.native
  
  /* standard DOM */
  @scala.inline
  def toString_(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[java.lang.String]
}
