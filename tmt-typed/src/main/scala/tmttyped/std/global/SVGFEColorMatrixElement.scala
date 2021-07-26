package tmttyped.std.global

import org.scalajs.dom.raw.EventListenerOptions
import tmttyped.std.AddEventListenerOptions
import tmttyped.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFEColorMatrixElement")
@js.native
class SVGFEColorMatrixElement ()
  extends StObject
     with tmttyped.std.SVGFEColorMatrixElement {
  
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
  override val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  
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
  override val result: org.scalajs.dom.raw.SVGAnimatedString = js.native
  
  /* CompleteClass */
  override val style: org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  
  /* CompleteClass */
  override val width: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  override val x: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  override val y: org.scalajs.dom.raw.SVGAnimatedLength = js.native
}
object SVGFEColorMatrixElement {
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_HUEROTATE")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_MATRIX")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_SATURATE")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_UNKNOWN")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Double = js.native
}
