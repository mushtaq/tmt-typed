package tmttyped.std.global

import tmttyped.std.ArrayLike
import tmttyped.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reflect {
  
  @JSGlobal("Reflect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calls the function with the specified object as the this value
    * and the elements of specified array as the arguments.
    * @param target The function to call.
    * @param thisArgument The object to be used as the this object.
    * @param argumentsList An array of argument values to be passed to the function.
    */
  @scala.inline
  def apply(target: js.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Constructs the target with the elements of specified array as the arguments
    * and the specified constructor as the `new.target` value.
    * @param target The constructor to invoke.
    * @param argumentsList An array of argument values to be passed to the constructor.
    * @param newTarget The constructor to be used as the `new.target` object.
    */
  @scala.inline
  def construct(target: js.Function, argumentsList: ArrayLike[_]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def construct(target: js.Function, argumentsList: ArrayLike[_], newTarget: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Adds a property to an object, or modifies attributes of an existing property.
    * @param target Object on which to add or modify the property. This can be a native JavaScript object
    *        (that is, a user-defined object or a built in object) or a DOM object.
    * @param propertyKey The property name.
    * @param attributes Descriptor for the property. It can be for a data property or an accessor property.
    */
  @scala.inline
  def defineProperty(target: js.Object, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /**
    * Removes a property from an object, equivalent to `delete target[propertyKey]`,
    * except it won't throw if `target[propertyKey]` is non-configurable.
    * @param target Object from which to remove the own property.
    * @param propertyKey The property name.
    */
  @scala.inline
  def deleteProperty(target: js.Object, propertyKey: PropertyKey): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /**
    * Gets the property of target, equivalent to `target[propertyKey]` when `receiver === target`.
    * @param target Object that contains the property on itself or in its prototype chain.
    * @param propertyKey The property name.
    * @param receiver The reference to use as the `this` value in the getter function,
    *        if `target[propertyKey]` is an accessor property.
    */
  @scala.inline
  def get(target: js.Object, propertyKey: PropertyKey): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def get(target: js.Object, propertyKey: PropertyKey, receiver: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Gets the own property descriptor of the specified object.
    * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
    * @param target Object that contains the property.
    * @param propertyKey The property name.
    */
  @scala.inline
  def getOwnPropertyDescriptor(target: js.Object, propertyKey: PropertyKey): js.UndefOr[js.PropertyDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.PropertyDescriptor]]
  
  /**
    * Returns the prototype of an object.
    * @param target The object that references the prototype.
    */
  @scala.inline
  def getPrototypeOf(target: js.Object): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]
  
  /**
    * Equivalent to `propertyKey in target`.
    * @param target Object that contains the property on itself or in its prototype chain.
    * @param propertyKey Name of the property.
    */
  @scala.inline
  def has(target: js.Object, propertyKey: PropertyKey): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /**
    * Returns a value that indicates whether new properties can be added to an object.
    * @param target Object to test.
    */
  @scala.inline
  def isExtensible(target: js.Object): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /**
    * Returns the string and symbol keys of the own properties of an object. The own properties of an object
    * are those that are defined directly on that object, and are not inherited from the object's prototype.
    * @param target Object that contains the own properties.
    */
  @scala.inline
  def ownKeys(target: js.Object): js.Array[java.lang.String | js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String | js.Symbol]]
  
  /**
    * Prevents the addition of new properties to an object.
    * @param target Object to make non-extensible.
    * @return Whether the object has been made non-extensible.
    */
  @scala.inline
  def preventExtensions(target: js.Object): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /**
    * Sets the property of target, equivalent to `target[propertyKey] = value` when `receiver === target`.
    * @param target Object that contains the property on itself or in its prototype chain.
    * @param propertyKey Name of the property.
    * @param receiver The reference to use as the `this` value in the setter function,
    *        if `target[propertyKey]` is an accessor property.
    */
  @scala.inline
  def set(target: js.Object, propertyKey: PropertyKey, value: js.Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def set(target: js.Object, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /**
    * Sets the prototype of a specified object o to object proto or null.
    * @param target The object to change its prototype.
    * @param proto The value of the new prototype or null.
    * @return Whether setting the prototype was successful.
    */
  @scala.inline
  def setPrototypeOf(target: js.Object): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def setPrototypeOf(target: js.Object, proto: js.Object): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
