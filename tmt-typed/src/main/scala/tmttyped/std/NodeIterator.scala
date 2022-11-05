package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
trait NodeIterator extends StObject {
  
  /** @deprecated */
  /* standard DOM */
  def detach(): Unit
  
  /* standard DOM */
  val filter: org.scalajs.dom.NodeFilter | Null
  
  /* standard DOM */
  def nextNode(): org.scalajs.dom.Node | Null
  
  /* standard DOM */
  val pointerBeforeReferenceNode: scala.Boolean
  
  /* standard DOM */
  def previousNode(): org.scalajs.dom.Node | Null
  
  /* standard DOM */
  val referenceNode: org.scalajs.dom.Node
  
  /* standard DOM */
  val root: org.scalajs.dom.Node
  
  /* standard DOM */
  val whatToShow: Double
}
object NodeIterator {
  
  inline def apply(
    detach: () => Unit,
    nextNode: () => org.scalajs.dom.Node | Null,
    pointerBeforeReferenceNode: scala.Boolean,
    previousNode: () => org.scalajs.dom.Node | Null,
    referenceNode: org.scalajs.dom.Node,
    root: org.scalajs.dom.Node,
    whatToShow: Double
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[NodeIterator]
  }
  
  extension [Self <: NodeIterator](x: Self) {
    
    inline def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    inline def setFilter(value: org.scalajs.dom.NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setNextNode(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    inline def setPointerBeforeReferenceNode(value: scala.Boolean): Self = StObject.set(x, "pointerBeforeReferenceNode", value.asInstanceOf[js.Any])
    
    inline def setPreviousNode(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    inline def setReferenceNode(value: org.scalajs.dom.Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: org.scalajs.dom.Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
