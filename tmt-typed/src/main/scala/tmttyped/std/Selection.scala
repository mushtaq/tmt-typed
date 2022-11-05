package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Selection object represents the range of text selected by the user or the current position of the caret. To obtain a Selection object for examination or modification, call Window.getSelection(). */
@js.native
trait Selection extends StObject {
  
  /* standard DOM */
  def addRange(range: org.scalajs.dom.Range): Unit = js.native
  
  /* standard DOM */
  val anchorNode: org.scalajs.dom.Node | Null = js.native
  
  /* standard DOM */
  val anchorOffset: Double = js.native
  
  /* standard DOM */
  def collapse(): Unit = js.native
  def collapse(node: org.scalajs.dom.Node): Unit = js.native
  def collapse(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  def collapse(node: Null, offset: Double): Unit = js.native
  
  /* standard DOM */
  def collapseToEnd(): Unit = js.native
  
  /* standard DOM */
  def collapseToStart(): Unit = js.native
  
  /* standard DOM */
  def containsNode(node: org.scalajs.dom.Node): scala.Boolean = js.native
  def containsNode(node: org.scalajs.dom.Node, allowPartialContainment: scala.Boolean): scala.Boolean = js.native
  
  /* standard DOM */
  def deleteFromDocument(): Unit = js.native
  
  /* standard DOM */
  def empty(): Unit = js.native
  
  /* standard DOM */
  def extend(node: org.scalajs.dom.Node): Unit = js.native
  def extend(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  
  /* standard DOM */
  val focusNode: org.scalajs.dom.Node | Null = js.native
  
  /* standard DOM */
  val focusOffset: Double = js.native
  
  /* standard DOM */
  def getRangeAt(index: Double): org.scalajs.dom.Range = js.native
  
  /* standard DOM */
  val isCollapsed: scala.Boolean = js.native
  
  /* standard DOM */
  val rangeCount: Double = js.native
  
  /* standard DOM */
  def removeAllRanges(): Unit = js.native
  
  /* standard DOM */
  def removeRange(range: org.scalajs.dom.Range): Unit = js.native
  
  /* standard DOM */
  def selectAllChildren(node: org.scalajs.dom.Node): Unit = js.native
  
  /* standard DOM */
  def setBaseAndExtent(
    anchorNode: org.scalajs.dom.Node,
    anchorOffset: Double,
    focusNode: org.scalajs.dom.Node,
    focusOffset: Double
  ): Unit = js.native
  
  /* standard DOM */
  def setPosition(): Unit = js.native
  def setPosition(node: org.scalajs.dom.Node): Unit = js.native
  def setPosition(node: org.scalajs.dom.Node, offset: Double): Unit = js.native
  def setPosition(node: Null, offset: Double): Unit = js.native
  
  /* standard DOM */
  val `type`: java.lang.String = js.native
}
