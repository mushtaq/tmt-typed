package tmttyped.std.global

import tmttyped.std.MutationRecordType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MutationRecord")
@js.native
/* standard DOM */
open class MutationRecord ()
  extends StObject
     with tmttyped.std.MutationRecord {
  
  /** Return the nodes added and removed respectively. */
  /* standard DOM */
  /* CompleteClass */
  override val addedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node] = js.native
  
  /** Returns the local name of the changed attribute, and null otherwise. */
  /* standard DOM */
  /* CompleteClass */
  override val attributeName: java.lang.String | Null = js.native
  
  /** Returns the namespace of the changed attribute, and null otherwise. */
  /* standard DOM */
  /* CompleteClass */
  override val attributeNamespace: java.lang.String | Null = js.native
  
  /** Return the previous and next sibling respectively of the added or removed nodes, and null otherwise. */
  /* standard DOM */
  /* CompleteClass */
  override val nextSibling: org.scalajs.dom.Node | Null = js.native
  
  /** The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null. */
  /* standard DOM */
  /* CompleteClass */
  override val oldValue: java.lang.String | Null = js.native
  
  /** Return the previous and next sibling respectively of the added or removed nodes, and null otherwise. */
  /* standard DOM */
  /* CompleteClass */
  override val previousSibling: org.scalajs.dom.Node | Null = js.native
  
  /** Return the nodes added and removed respectively. */
  /* standard DOM */
  /* CompleteClass */
  override val removedNodes: org.scalajs.dom.NodeList[org.scalajs.dom.Node] = js.native
  
  /** Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed. */
  /* standard DOM */
  /* CompleteClass */
  override val target: org.scalajs.dom.Node = js.native
  
  /** Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes. */
  /* standard DOM */
  /* CompleteClass */
  override val `type`: MutationRecordType = js.native
}
