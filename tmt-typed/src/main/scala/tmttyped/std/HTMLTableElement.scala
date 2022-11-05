package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document. */
@js.native
trait HTMLTableElement
  extends StObject
     with HTMLElement {
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Sets or retrieves a value that indicates the table alignment.
    * @deprecated
    */
  /* standard DOM */
  var align: java.lang.String = js.native
  
  /** @deprecated */
  /* standard DOM */
  var bgColor: java.lang.String = js.native
  
  /**
    * Sets or retrieves the width of the border to draw around the object.
    * @deprecated
    */
  /* standard DOM */
  var border: java.lang.String = js.native
  
  /** Retrieves the caption object of a table. */
  /* standard DOM */
  var caption: org.scalajs.dom.HTMLTableCaptionElement | Null = js.native
  
  /**
    * Sets or retrieves the amount of space between the border of the cell and the content of the cell.
    * @deprecated
    */
  /* standard DOM */
  var cellPadding: java.lang.String = js.native
  
  /**
    * Sets or retrieves the amount of space between cells in a table.
    * @deprecated
    */
  /* standard DOM */
  var cellSpacing: java.lang.String = js.native
  
  /** Creates an empty caption element in the table. */
  /* standard DOM */
  def createCaption(): org.scalajs.dom.HTMLTableCaptionElement = js.native
  
  /** Creates an empty tBody element in the table. */
  /* standard DOM */
  def createTBody(): org.scalajs.dom.HTMLTableSectionElement = js.native
  
  /** Creates an empty tFoot element in the table. */
  /* standard DOM */
  def createTFoot(): org.scalajs.dom.HTMLTableSectionElement = js.native
  
  /** Returns the tHead element object if successful, or null otherwise. */
  /* standard DOM */
  def createTHead(): org.scalajs.dom.HTMLTableSectionElement = js.native
  
  /** Deletes the caption element and its contents from the table. */
  /* standard DOM */
  def deleteCaption(): Unit = js.native
  
  /**
    * Removes the specified row (tr) from the element and from the rows collection.
    * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
    */
  /* standard DOM */
  def deleteRow(index: Double): Unit = js.native
  
  /** Deletes the tFoot element and its contents from the table. */
  /* standard DOM */
  def deleteTFoot(): Unit = js.native
  
  /** Deletes the tHead element and its contents from the table. */
  /* standard DOM */
  def deleteTHead(): Unit = js.native
  
  /**
    * Sets or retrieves the way the border frame around the table is displayed.
    * @deprecated
    */
  /* standard DOM */
  var frame: java.lang.String = js.native
  
  /**
    * Creates a new row (tr) in the table, and adds the row to the rows collection.
    * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
    */
  /* standard DOM */
  def insertRow(): org.scalajs.dom.HTMLTableRowElement = js.native
  def insertRow(index: Double): org.scalajs.dom.HTMLTableRowElement = js.native
  
  /* standard DOM */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /** Sets or retrieves the number of horizontal rows contained in the object. */
  /* standard DOM */
  val rows: HTMLCollectionOf[org.scalajs.dom.HTMLTableRowElement] = js.native
  
  /**
    * Sets or retrieves which dividing lines (inner borders) are displayed.
    * @deprecated
    */
  /* standard DOM */
  var rules: java.lang.String = js.native
  
  /**
    * Sets or retrieves a description and/or structure of the object.
    * @deprecated
    */
  /* standard DOM */
  var summary: java.lang.String = js.native
  
  /** Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order. */
  /* standard DOM */
  val tBodies: HTMLCollectionOf[org.scalajs.dom.HTMLTableSectionElement] = js.native
  
  /** Retrieves the tFoot object of the table. */
  /* standard DOM */
  var tFoot: org.scalajs.dom.HTMLTableSectionElement | Null = js.native
  
  /** Retrieves the tHead object of the table. */
  /* standard DOM */
  var tHead: org.scalajs.dom.HTMLTableSectionElement | Null = js.native
  
  /**
    * Sets or retrieves the width of the object.
    * @deprecated
    */
  /* standard DOM */
  var width: java.lang.String = js.native
}
