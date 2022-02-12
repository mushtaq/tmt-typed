package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides event properties that are specific to modifications to the Document Object Model (DOM) hierarchy and nodes.
  * @deprecated DOM4 [DOM] provides a new mechanism using a MutationObserver interface which addresses the use cases that mutation events solve, but in a more performant manner. Thus, this specification describes mutation events for reference and completeness of legacy behavior, but deprecates the use of the MutationEvent interface.
  */
@js.native
trait MutationEvent
  extends StObject
     with Event {
  
  /* standard DOM */
  val ADDITION: Double = js.native
  
  /* standard DOM */
  val MODIFICATION: Double = js.native
  
  /* standard DOM */
  val REMOVAL: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  val attrChange: Double = js.native
  
  /** @deprecated */
  /* standard DOM */
  val attrName: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  def initMutationEvent(
    typeArg: java.lang.String,
    bubblesArg: js.UndefOr[scala.Boolean],
    cancelableArg: js.UndefOr[scala.Boolean],
    relatedNodeArg: js.UndefOr[org.scalajs.dom.Node | Null],
    prevValueArg: js.UndefOr[java.lang.String],
    newValueArg: js.UndefOr[java.lang.String],
    attrNameArg: js.UndefOr[java.lang.String],
    attrChangeArg: js.UndefOr[Double]
  ): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  val newValue: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  val prevValue: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  val relatedNode: org.scalajs.dom.Node | Null = js.native
}
