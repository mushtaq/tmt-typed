package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices. */
@js.native
trait SVGSVGElement
  extends StObject
     with SVGGraphicsElement
     with SVGFitToViewBox
     with WindowEventHandlers {
  
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
  def animationsPaused(): scala.Boolean = js.native
  
  /* standard DOM */
  def checkEnclosure(element: org.scalajs.dom.SVGElement, rect: DOMRectReadOnly): scala.Boolean = js.native
  
  /* standard DOM */
  def checkIntersection(element: org.scalajs.dom.SVGElement, rect: DOMRectReadOnly): scala.Boolean = js.native
  
  /* standard DOM */
  def createSVGAngle(): org.scalajs.dom.SVGAngle = js.native
  
  /* standard DOM */
  def createSVGLength(): org.scalajs.dom.SVGLength = js.native
  
  /* standard DOM */
  def createSVGMatrix(): DOMMatrix = js.native
  
  /* standard DOM */
  def createSVGNumber(): org.scalajs.dom.SVGNumber = js.native
  
  /* standard DOM */
  def createSVGPoint(): DOMPoint = js.native
  
  /* standard DOM */
  def createSVGRect(): org.scalajs.dom.DOMRect = js.native
  
  /* standard DOM */
  def createSVGTransform(): org.scalajs.dom.SVGTransform = js.native
  
  /* standard DOM */
  def createSVGTransformFromMatrix(): org.scalajs.dom.SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: DOMMatrix2DInit): org.scalajs.dom.SVGTransform = js.native
  
  /* standard DOM */
  var currentScale: Double = js.native
  
  /* standard DOM */
  val currentTranslate: DOMPointReadOnly = js.native
  
  /* standard DOM */
  def deselectAll(): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def forceRedraw(): Unit = js.native
  
  /* standard DOM */
  def getCurrentTime(): Double = js.native
  
  /* standard DOM */
  def getElementById(elementId: java.lang.String): org.scalajs.dom.Element = js.native
  
  /* standard DOM */
  def getEnclosureList(rect: DOMRectReadOnly): org.scalajs.dom.NodeList[
    (org.scalajs.dom.SVGCircleElement | org.scalajs.dom.SVGEllipseElement | org.scalajs.dom.SVGImageElement | org.scalajs.dom.SVGLineElement | org.scalajs.dom.SVGPathElement | org.scalajs.dom.SVGPolygonElement | org.scalajs.dom.SVGPolylineElement | org.scalajs.dom.SVGRectElement | org.scalajs.dom.SVGTextElement | org.scalajs.dom.SVGUseElement) & org.scalajs.dom.Node
  ] = js.native
  def getEnclosureList(rect: DOMRectReadOnly, referenceElement: org.scalajs.dom.SVGElement): org.scalajs.dom.NodeList[
    (org.scalajs.dom.SVGCircleElement | org.scalajs.dom.SVGEllipseElement | org.scalajs.dom.SVGImageElement | org.scalajs.dom.SVGLineElement | org.scalajs.dom.SVGPathElement | org.scalajs.dom.SVGPolygonElement | org.scalajs.dom.SVGPolylineElement | org.scalajs.dom.SVGRectElement | org.scalajs.dom.SVGTextElement | org.scalajs.dom.SVGUseElement) & org.scalajs.dom.Node
  ] = js.native
  
  /* standard DOM */
  def getIntersectionList(rect: DOMRectReadOnly): org.scalajs.dom.NodeList[
    (org.scalajs.dom.SVGCircleElement | org.scalajs.dom.SVGEllipseElement | org.scalajs.dom.SVGImageElement | org.scalajs.dom.SVGLineElement | org.scalajs.dom.SVGPathElement | org.scalajs.dom.SVGPolygonElement | org.scalajs.dom.SVGPolylineElement | org.scalajs.dom.SVGRectElement | org.scalajs.dom.SVGTextElement | org.scalajs.dom.SVGUseElement) & org.scalajs.dom.Node
  ] = js.native
  def getIntersectionList(rect: DOMRectReadOnly, referenceElement: org.scalajs.dom.SVGElement): org.scalajs.dom.NodeList[
    (org.scalajs.dom.SVGCircleElement | org.scalajs.dom.SVGEllipseElement | org.scalajs.dom.SVGImageElement | org.scalajs.dom.SVGLineElement | org.scalajs.dom.SVGPathElement | org.scalajs.dom.SVGPolygonElement | org.scalajs.dom.SVGPolylineElement | org.scalajs.dom.SVGRectElement | org.scalajs.dom.SVGTextElement | org.scalajs.dom.SVGUseElement) & org.scalajs.dom.Node
  ] = js.native
  
  /* standard DOM */
  val height: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  def pauseAnimations(): Unit = js.native
  
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
  
  /* standard DOM */
  def setCurrentTime(seconds: Double): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  
  /* standard DOM */
  def unpauseAnimations(): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def unsuspendRedraw(suspendHandleID: Double): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  def unsuspendRedrawAll(): Unit = js.native
  
  /* standard DOM */
  val width: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val x: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard DOM */
  val y: org.scalajs.dom.SVGAnimatedLength = js.native
}
