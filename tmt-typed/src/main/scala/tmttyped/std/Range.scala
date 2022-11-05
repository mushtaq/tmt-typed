package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A fragment of a document that can contain nodes and parts of text nodes. */
@js.native
trait Range
  extends StObject
     with AbstractRange {
  
  /* standard DOM */
  val END_TO_END: Double = js.native
  
  /* standard DOM */
  val END_TO_START: Double = js.native
  
  /* standard DOM */
  val START_TO_END: Double = js.native
  
  /* standard DOM */
  val START_TO_START: Double = js.native
  
  /* standard DOM */
  def cloneContents(): org.scalajs.dom.DocumentFragment = js.native
  
  /* standard DOM */
  def cloneRange(): org.scalajs.dom.Range = js.native
  
  /* standard DOM */
  def collapse(): Unit = js.native
  def collapse(toStart: scala.Boolean): Unit = js.native
  
  /** Returns the node, furthest away from the document, that is an ancestor of both range's start node and end node. */
  /* standard DOM */
  val commonAncestorContainer: org.scalajs.dom.Node = js.native
  
  /* standard DOM */
  def compareBoundaryPoints(how: Double, sourceRange: org.scalajs.dom.Range): Double = js.native
  
  /** Returns −1 if the point is before the range, 0 if the point is in the range, and 1 if the point is after the range. */
  /* standard DOM */
  def comparePoint(node: org.scalajs.dom.Node, offset: Double): Double = js.native
  
  /* standard DOM */
  def createContextualFragment(fragment: java.lang.String): org.scalajs.dom.DocumentFragment = js.native
  
  /* standard DOM */
  def deleteContents(): Unit = js.native
  
  /* standard DOM */
  def detach(): Unit = js.native
  
  /* standard DOM */
  def extractContents(): org.scalajs.dom.DocumentFragment = js.native
  
  /* standard DOM */
  def getBoundingClientRect(): org.scalajs.dom.DOMRect = js.native
  
  /* standard DOM */
  def getClientRects(): DOMRectList = js.native
  
  /* standard DOM */
  def insertNode(node: org.scalajs.dom.Node): Unit = js.native
  
  /** Returns whether range intersects node. */
  /* standard DOM */
  def intersectsNode(node: org.scalajs.dom.Node): scala.Boolean = js.native
  
  /* standard DOM */
  def isPointInRange(node: org.scalajs.dom.Node, offset: Double): scala.Boolean = js.native
  
  /* standard DOM */
  def selectNode(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard DOM */
  def selectNodeContents(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard DOM */
  def setEnd(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  
  /* standard DOM */
  def setEndAfter(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard DOM */
  def setEndBefore(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard DOM */
  def setStart(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  
  /* standard DOM */
  def setStartAfter(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard DOM */
  def setStartBefore(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard DOM */
  def surroundContents(newParent: org.scalajs.dom.Node): Unit = js.native
}
