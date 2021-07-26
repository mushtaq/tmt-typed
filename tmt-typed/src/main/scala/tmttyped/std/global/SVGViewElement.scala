package tmttyped.std.global

import org.scalajs.dom.raw.EventListenerOptions
import tmttyped.std.AddEventListenerOptions
import tmttyped.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGViewElement")
@js.native
class SVGViewElement ()
  extends StObject
     with tmttyped.std.SVGViewElement {
  
  /* CompleteClass */
  override val SVG_ZOOMANDPAN_DISABLE: Double = js.native
  
  /* CompleteClass */
  override val SVG_ZOOMANDPAN_MAGNIFY: Double = js.native
  
  /* CompleteClass */
  override val SVG_ZOOMANDPAN_UNKNOWN: Double = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* CompleteClass */
  override val assignedSlot: tmttyped.std.HTMLSlotElement | Null = js.native
  
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
  /* CompleteClass */
  override val preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* CompleteClass */
  override val style: org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  
  /* CompleteClass */
  override val viewBox: org.scalajs.dom.raw.SVGAnimatedRect = js.native
  
  /* CompleteClass */
  override var zoomAndPan: Double = js.native
}
object SVGViewElement {
  
  @JSGlobal("SVGViewElement.SVG_ZOOMANDPAN_DISABLE")
  @js.native
  val SVG_ZOOMANDPAN_DISABLE: Double = js.native
  
  @JSGlobal("SVGViewElement.SVG_ZOOMANDPAN_MAGNIFY")
  @js.native
  val SVG_ZOOMANDPAN_MAGNIFY: Double = js.native
  
  @JSGlobal("SVGViewElement.SVG_ZOOMANDPAN_UNKNOWN")
  @js.native
  val SVG_ZOOMANDPAN_UNKNOWN: Double = js.native
}
