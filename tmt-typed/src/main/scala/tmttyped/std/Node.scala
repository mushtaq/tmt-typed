package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Node is an interface from which a number of DOM API object types inherit. It allows those types to be treated similarly; for example, inheriting the same set of methods, or being tested in the same way. */
@js.native
trait Node
  extends StObject
     with EventTarget {
  
  /* standard DOM */
  val ATTRIBUTE_NODE: Double = js.native
  
  /** node is a CDATASection node. */
  /* standard DOM */
  val CDATA_SECTION_NODE: Double = js.native
  
  /** node is a Comment node. */
  /* standard DOM */
  val COMMENT_NODE: Double = js.native
  
  /** node is a DocumentFragment node. */
  /* standard DOM */
  val DOCUMENT_FRAGMENT_NODE: Double = js.native
  
  /** node is a document. */
  /* standard DOM */
  val DOCUMENT_NODE: Double = js.native
  
  /** Set when other is a descendant of node. */
  /* standard DOM */
  val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
  
  /** Set when other is an ancestor of node. */
  /* standard DOM */
  val DOCUMENT_POSITION_CONTAINS: Double = js.native
  
  /** Set when node and other are not in the same tree. */
  /* standard DOM */
  val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
  
  /** Set when other is following node. */
  /* standard DOM */
  val DOCUMENT_POSITION_FOLLOWING: Double = js.native
  
  /* standard DOM */
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
  
  /** Set when other is preceding node. */
  /* standard DOM */
  val DOCUMENT_POSITION_PRECEDING: Double = js.native
  
  /** node is a doctype. */
  /* standard DOM */
  val DOCUMENT_TYPE_NODE: Double = js.native
  
  /** node is an element. */
  /* standard DOM */
  val ELEMENT_NODE: Double = js.native
  
  /* standard DOM */
  val ENTITY_NODE: Double = js.native
  
  /* standard DOM */
  val ENTITY_REFERENCE_NODE: Double = js.native
  
  /* standard DOM */
  val NOTATION_NODE: Double = js.native
  
  /** node is a ProcessingInstruction node. */
  /* standard DOM */
  val PROCESSING_INSTRUCTION_NODE: Double = js.native
  
  /** node is a Text node. */
  /* standard DOM */
  val TEXT_NODE: Double = js.native
  
  /* standard DOM */
  def appendChild[T /* <: org.scalajs.dom.Node */](node: T): T = js.native
  
  /** Returns node's node document's document base URL. */
  /* standard DOM */
  val baseURI: java.lang.String = js.native
  
  /** Returns the children. */
  /* standard DOM */
  val childNodes: org.scalajs.dom.NodeList[ChildNode & org.scalajs.dom.Node] = js.native
  
  /** Returns a copy of node. If deep is true, the copy also includes the node's descendants. */
  /* standard DOM */
  def cloneNode(): org.scalajs.dom.Node = js.native
  def cloneNode(deep: scala.Boolean): org.scalajs.dom.Node = js.native
  
  /** Returns a bitmask indicating the position of other relative to node. */
  /* standard DOM */
  def compareDocumentPosition(other: org.scalajs.dom.Node): Double = js.native
  
  /** Returns true if other is an inclusive descendant of node, and false otherwise. */
  /* standard DOM */
  def contains(): scala.Boolean = js.native
  def contains(other: org.scalajs.dom.Node): scala.Boolean = js.native
  
  /** Returns the first child. */
  /* standard DOM */
  val firstChild: ChildNode | Null = js.native
  
  /** Returns node's root. */
  /* standard DOM */
  def getRootNode(): org.scalajs.dom.Node = js.native
  def getRootNode(options: GetRootNodeOptions): org.scalajs.dom.Node = js.native
  
  /** Returns whether node has children. */
  /* standard DOM */
  def hasChildNodes(): scala.Boolean = js.native
  
  /* standard DOM */
  def insertBefore[T /* <: org.scalajs.dom.Node */](node: T): T = js.native
  def insertBefore[T /* <: org.scalajs.dom.Node */](node: T, child: org.scalajs.dom.Node): T = js.native
  
  /** Returns true if node is connected and false otherwise. */
  /* standard DOM */
  val isConnected: scala.Boolean = js.native
  
  /* standard DOM */
  def isDefaultNamespace(): scala.Boolean = js.native
  def isDefaultNamespace(namespace: java.lang.String): scala.Boolean = js.native
  
  /** Returns whether node and otherNode have the same properties. */
  /* standard DOM */
  def isEqualNode(): scala.Boolean = js.native
  def isEqualNode(otherNode: org.scalajs.dom.Node): scala.Boolean = js.native
  
  /* standard DOM */
  def isSameNode(): scala.Boolean = js.native
  def isSameNode(otherNode: org.scalajs.dom.Node): scala.Boolean = js.native
  
  /** Returns the last child. */
  /* standard DOM */
  val lastChild: ChildNode | Null = js.native
  
  /* standard DOM */
  def lookupNamespaceURI(): java.lang.String | Null = js.native
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  
  /* standard DOM */
  def lookupPrefix(): java.lang.String | Null = js.native
  def lookupPrefix(namespace: java.lang.String): java.lang.String | Null = js.native
  
  /** Returns the next sibling. */
  /* standard DOM */
  val nextSibling: ChildNode | Null = js.native
  
  /** Returns a string appropriate for the type of node. */
  /* standard DOM */
  val nodeName: java.lang.String = js.native
  
  /** Returns the type of node. */
  /* standard DOM */
  val nodeType: Double = js.native
  
  /* standard DOM */
  var nodeValue: java.lang.String | Null = js.native
  
  /** Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes. */
  /* standard DOM */
  def normalize(): Unit = js.native
  
  /** Returns the node document. Returns null for documents. */
  /* standard DOM */
  val ownerDocument: org.scalajs.dom.Document | Null = js.native
  
  /** Returns the parent element. */
  /* standard DOM */
  val parentElement: org.scalajs.dom.HTMLElement | Null = js.native
  
  /** Returns the parent. */
  /* standard DOM */
  val parentNode: org.scalajs.dom.ParentNode | Null = js.native
  
  /** Returns the previous sibling. */
  /* standard DOM */
  val previousSibling: ChildNode | Null = js.native
  
  /* standard DOM */
  def removeChild[T /* <: org.scalajs.dom.Node */](child: T): T = js.native
  
  /* standard DOM */
  def replaceChild[T /* <: org.scalajs.dom.Node */](node: org.scalajs.dom.Node, child: T): T = js.native
  
  /* standard DOM */
  var textContent: java.lang.String | Null = js.native
}
