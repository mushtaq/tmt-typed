package tmttyped.std.global

import tmttyped.std.DOMHighResTimeStamp
import tmttyped.std.PerformanceMarkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PerformanceMark")
@js.native
open class PerformanceMark protected ()
  extends StObject
     with tmttyped.std.PerformanceMark {
  /* standard DOM */
  def this(markName: java.lang.String) = this()
  def this(markName: java.lang.String, markOptions: PerformanceMarkOptions) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override val detail: Any = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val duration: DOMHighResTimeStamp = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val entryType: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val name: java.lang.String = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override val startTime: DOMHighResTimeStamp = js.native
  
  /* standard DOM */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
