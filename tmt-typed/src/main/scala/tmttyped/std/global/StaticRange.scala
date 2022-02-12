package tmttyped.std.global

import tmttyped.std.StaticRangeInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StaticRange")
@js.native
class StaticRange protected ()
  extends StObject
     with tmttyped.std.AbstractRange {
  /* standard DOM */
  def this(init: StaticRangeInit) = this()
  
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
