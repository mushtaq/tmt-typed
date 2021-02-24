package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverEntry extends StObject {
  
  val borderBoxSize: js.Array[ResizeObserverSize]
  
  val contentBoxSize: js.Array[ResizeObserverSize]
  
  val contentRect: DOMRectReadOnly
  
  val target: org.scalajs.dom.raw.Element
}
object ResizeObserverEntry {
  
  @scala.inline
  def apply(
    borderBoxSize: js.Array[ResizeObserverSize],
    contentBoxSize: js.Array[ResizeObserverSize],
    contentRect: DOMRectReadOnly,
    target: org.scalajs.dom.raw.Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  
  @scala.inline
  implicit class ResizeObserverEntryMutableBuilder[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "borderBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "borderBoxSize", js.Array(value :_*))
    
    @scala.inline
    def setContentBoxSize(value: js.Array[ResizeObserverSize]): Self = StObject.set(x, "contentBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentBoxSizeVarargs(value: ResizeObserverSize*): Self = StObject.set(x, "contentBoxSize", js.Array(value :_*))
    
    @scala.inline
    def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
