package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any CSS at-rule that contains other rules nested within it. */
@js.native
trait CSSGroupingRule
  extends StObject
     with CSSRule {
  
  /* standard DOM */
  val cssRules: org.scalajs.dom.CSSRuleList = js.native
  
  /* standard DOM */
  def deleteRule(index: Double): Unit = js.native
  
  /* standard DOM */
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
}
