package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement. */
@js.native
trait SVGTextContentElement
  extends StObject
     with SVGGraphicsElement {
  
  /* standard DOM */
  val LENGTHADJUST_SPACING: Double = js.native
  
  /* standard DOM */
  val LENGTHADJUST_SPACINGANDGLYPHS: Double = js.native
  
  /* standard DOM */
  val LENGTHADJUST_UNKNOWN: Double = js.native
  
  /* standard DOM */
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
  
  /* standard DOM */
  def getCharNumAtPosition(): Double = js.native
  def getCharNumAtPosition(point: DOMPointInit): Double = js.native
  
  /* standard DOM */
  def getComputedTextLength(): Double = js.native
  
  /* standard DOM */
  def getEndPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /* standard DOM */
  def getExtentOfChar(charnum: Double): org.scalajs.dom.DOMRect = js.native
  
  /* standard DOM */
  def getNumberOfChars(): Double = js.native
  
  /* standard DOM */
  def getRotationOfChar(charnum: Double): Double = js.native
  
  /* standard DOM */
  def getStartPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /* standard DOM */
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  
  /* standard DOM */
  val lengthAdjust: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  /* standard DOM */
  val textLength: org.scalajs.dom.SVGAnimatedLength = js.native
}
