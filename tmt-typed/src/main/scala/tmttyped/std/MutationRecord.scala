package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A MutationRecord represents an individual DOM mutation. It is the object that is passed to MutationObserver's callback. */
trait MutationRecord extends StObject {
  
  /** Return the nodes added and removed respectively. */
  /* standard DOM */
  val addedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node]
  
  /** Returns the local name of the changed attribute, and null otherwise. */
  /* standard DOM */
  val attributeName: java.lang.String | Null
  
  /** Returns the namespace of the changed attribute, and null otherwise. */
  /* standard DOM */
  val attributeNamespace: java.lang.String | Null
  
  /** Return the previous and next sibling respectively of the added or removed nodes, and null otherwise. */
  /* standard DOM */
  val nextSibling: org.scalajs.dom.Node | Null
  
  /** The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null. */
  /* standard DOM */
  val oldValue: java.lang.String | Null
  
  /** Return the previous and next sibling respectively of the added or removed nodes, and null otherwise. */
  /* standard DOM */
  val previousSibling: org.scalajs.dom.Node | Null
  
  /** Return the nodes added and removed respectively. */
  /* standard DOM */
  val removedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node]
  
  /** Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed. */
  /* standard DOM */
  val target: org.scalajs.dom.Node
  
  /** Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes. */
  /* standard DOM */
  val `type`: MutationRecordType
}
object MutationRecord {
  
  @scala.inline
  def apply(
    addedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node],
    removedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node],
    target: org.scalajs.dom.Node,
    `type`: MutationRecordType
  ): MutationRecord = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNodes = removedNodes.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], attributeName = null, attributeNamespace = null, nextSibling = null, oldValue = null, previousSibling = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationRecord]
  }
  
  @scala.inline
  implicit class MutationRecordMutableBuilder[Self <: MutationRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedNodes(value: org.scalajs.dom.NodeList[org.scalajs.dom.Node]): Self = StObject.set(x, "addedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeName(value: java.lang.String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameNull: Self = StObject.set(x, "attributeName", null)
    
    @scala.inline
    def setAttributeNamespace(value: java.lang.String): Self = StObject.set(x, "attributeNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNamespaceNull: Self = StObject.set(x, "attributeNamespace", null)
    
    @scala.inline
    def setNextSibling(value: org.scalajs.dom.Node): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    
    @scala.inline
    def setOldValue(value: java.lang.String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    @scala.inline
    def setPreviousSibling(value: org.scalajs.dom.Node): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
    
    @scala.inline
    def setRemovedNodes(value: org.scalajs.dom.NodeList[org.scalajs.dom.Node]): Self = StObject.set(x, "removedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MutationRecordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
