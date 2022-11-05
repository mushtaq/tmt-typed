package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet. */
@js.native
trait CSSStyleSheet
  extends StObject
     with StyleSheet {
  
  /** @deprecated */
  /* standard DOM */
  def addRule(): Double = js.native
  def addRule(selector: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String, index: Double): Double = js.native
  def addRule(selector: java.lang.String, style: Unit, index: Double): Double = js.native
  def addRule(selector: Unit, style: java.lang.String): Double = js.native
  def addRule(selector: Unit, style: java.lang.String, index: Double): Double = js.native
  def addRule(selector: Unit, style: Unit, index: Double): Double = js.native
  
  /* standard DOM */
  val cssRules: org.scalajs.dom.CSSRuleList = js.native
  
  /* standard DOM */
  def deleteRule(index: Double): Unit = js.native
  
  /* standard DOM */
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  
  /* standard DOM */
  val ownerRule: org.scalajs.dom.CSSRule | Null = js.native
  
  /** @deprecated */
  /* standard DOM */
  def removeRule(): Unit = js.native
  def removeRule(index: Double): Unit = js.native
  
  /* standard DOM */
  def replace(text: java.lang.String): js.Promise[org.scalajs.dom.CSSStyleSheet] = js.native
  
  /* standard DOM */
  def replaceSync(text: java.lang.String): Unit = js.native
  
  /** @deprecated */
  /* standard DOM */
  val rules: org.scalajs.dom.CSSRuleList = js.native
}
