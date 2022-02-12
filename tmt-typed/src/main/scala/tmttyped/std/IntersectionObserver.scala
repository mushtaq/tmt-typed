package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
trait IntersectionObserver extends StObject {
  
  /* standard DOM */
  def disconnect(): Unit
  
  /* standard DOM */
  def observe(target: org.scalajs.dom.Element): Unit
  
  /* standard DOM */
  val root: org.scalajs.dom.Element | org.scalajs.dom.Document | Null
  
  /* standard DOM */
  val rootMargin: java.lang.String
  
  /* standard DOM */
  def takeRecords(): js.Array[IntersectionObserverEntry]
  
  /* standard DOM */
  val thresholds: js.Array[Double]
  
  /* standard DOM */
  def unobserve(target: org.scalajs.dom.Element): Unit
}
object IntersectionObserver {
  
  @scala.inline
  def apply(
    disconnect: () => Unit,
    observe: org.scalajs.dom.Element => Unit,
    rootMargin: java.lang.String,
    takeRecords: () => js.Array[IntersectionObserverEntry],
    thresholds: js.Array[Double],
    unobserve: org.scalajs.dom.Element => Unit
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = js.Any.fromFunction0(takeRecords), thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve), root = null)
    __obj.asInstanceOf[IntersectionObserver]
  }
  
  @scala.inline
  implicit class IntersectionObserverMutableBuilder[Self <: IntersectionObserver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObserve(value: org.scalajs.dom.Element => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoot(value: org.scalajs.dom.Element | org.scalajs.dom.Document): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootMargin(value: java.lang.String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setTakeRecords(value: () => js.Array[IntersectionObserverEntry]): Self = StObject.set(x, "takeRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThresholds(value: js.Array[Double]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsVarargs(value: Double*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    
    @scala.inline
    def setUnobserve(value: org.scalajs.dom.Element => Unit): Self = StObject.set(x, "unobserve", js.Any.fromFunction1(value))
  }
}
