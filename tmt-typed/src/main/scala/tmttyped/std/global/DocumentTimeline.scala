package tmttyped.std.global

import tmttyped.std.DocumentTimelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DocumentTimeline")
@js.native
/* standard DOM */
open class DocumentTimeline ()
  extends StObject
     with tmttyped.std.AnimationTimeline {
  def this(options: DocumentTimelineOptions) = this()
  
  /* standard DOM */
  /* CompleteClass */
  override val currentTime: Double | Null = js.native
}
