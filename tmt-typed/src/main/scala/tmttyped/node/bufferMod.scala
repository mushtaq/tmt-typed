package tmttyped.node

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.anon.Data
import tmttyped.node.anon.ToPrimitive
import tmttyped.node.anon.ValueOf
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.bufferMod.global.BufferConstructor
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.cryptoMod.BinaryLike
import tmttyped.node.cryptoMod._KeyLike
import tmttyped.node.fsMod._EncodingOption
import tmttyped.node.fsMod._PathLike
import tmttyped.std.SharedArrayBuffer
import tmttyped.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("buffer", "Blob")
  @js.native
  class Blob protected () extends StObject {
    /**
      * Creates a new `Blob` object containing a concatenation of the given sources.
      *
      * {ArrayBuffer}, {TypedArray}, {DataView}, and {Buffer} sources are copied into
      * the 'Blob' and can therefore be safely modified after the 'Blob' is created.
      *
      * String sources are also copied into the `Blob`.
      */
    def this(sources: js.Array[BinaryLike | Blob]) = this()
    def this(sources: js.Array[BinaryLike | Blob], options: BlobOptions) = this()
    
    /**
      * Returns a promise that fulfills with an [&lt;ArrayBuffer&gt;](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer) containing a copy of
      * the `Blob` data.
      * @since v15.7.0
      */
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * The total size of the `Blob` in bytes.
      * @since v15.7.0
      */
    val size: Double = js.native
    
    /**
      * Creates and returns a new `Blob` containing a subset of this `Blob` objects
      * data. The original `Blob` is not altered.
      * @since v15.7.0
      * @param start The starting index.
      * @param end The ending index.
      * @param type The content-type for the new `Blob`
      */
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, `type`: java.lang.String): Blob = js.native
    def slice(start: Double, end: Unit, `type`: java.lang.String): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    def slice(start: Unit, end: Double, `type`: java.lang.String): Blob = js.native
    def slice(start: Unit, end: Unit, `type`: java.lang.String): Blob = js.native
    
    /**
      * Returns a promise that resolves the contents of the `Blob` decoded as a UTF-8
      * string.
      * @since v15.7.0
      */
    def text(): js.Promise[java.lang.String] = js.native
    
    /**
      * The content-type of the `Blob`.
      * @since v15.7.0
      */
    val `type`: java.lang.String = js.native
  }
  
  @JSImport("buffer", "Buffer")
  @js.native
  def Buffer: BufferConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("buffer", "Buffer")
  @js.native
  class BufferCls protected ()
    extends StObject
       with Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    def this(arrayBuffer: SharedArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[js.Any]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    def this(str: java.lang.String) = this()
    def this(str: java.lang.String, encoding: BufferEncoding) = this()
  }
  
  @scala.inline
  def Buffer_=(x: BufferConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(x.asInstanceOf[js.Any])
  
  @JSImport("buffer", "INSPECT_MAX_BYTES")
  @js.native
  val INSPECT_MAX_BYTES: Double = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("buffer", "SlowBuffer")
  @js.native
  class SlowBuffer protected ()
    extends StObject
       with Buffer {
    /** @deprecated since v6.0.0, use `Buffer.allocUnsafeSlow()` */
    def this(size: Double) = this()
  }
  
  object constants {
    
    @JSImport("buffer", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("buffer", "constants.MAX_LENGTH")
    @js.native
    def MAX_LENGTH: Double = js.native
    @scala.inline
    def MAX_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("buffer", "constants.MAX_STRING_LENGTH")
    @js.native
    def MAX_STRING_LENGTH: Double = js.native
    @scala.inline
    def MAX_STRING_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_STRING_LENGTH")(x.asInstanceOf[js.Any])
  }
  
  object global {
    
    @js.native
    trait Buffer
      extends StObject
         with Uint8Array
         with _KeyLike
         with _PathLike {
      
      /**
        * Compares `buf` with `target` and returns a number indicating whether `buf`comes before, after, or is the same as `target` in sort order.
        * Comparison is based on the actual sequence of bytes in each `Buffer`.
        *
        * * `0` is returned if `target` is the same as `buf`
        * * `1` is returned if `target` should come _before_`buf` when sorted.
        * * `-1` is returned if `target` should come _after_`buf` when sorted.
        *
        * ```js
        * const buf1 = Buffer.from('ABC');
        * const buf2 = Buffer.from('BCD');
        * const buf3 = Buffer.from('ABCD');
        *
        * console.log(buf1.compare(buf1));
        * // Prints: 0
        * console.log(buf1.compare(buf2));
        * // Prints: -1
        * console.log(buf1.compare(buf3));
        * // Prints: -1
        * console.log(buf2.compare(buf1));
        * // Prints: 1
        * console.log(buf2.compare(buf3));
        * // Prints: 1
        * console.log([buf1, buf2, buf3].sort(Buffer.compare));
        * // Prints: [ <Buffer 41 42 43>, <Buffer 41 42 43 44>, <Buffer 42 43 44> ]
        * // (This result is equal to: [buf1, buf3, buf2].)
        * ```
        *
        * The optional `targetStart`, `targetEnd`, `sourceStart`, and `sourceEnd`arguments can be used to limit the comparison to specific ranges within `target`and `buf` respectively.
        *
        * ```js
        * const buf1 = Buffer.from([1, 2, 3, 4, 5, 6, 7, 8, 9]);
        * const buf2 = Buffer.from([5, 6, 7, 8, 9, 1, 2, 3, 4]);
        *
        * console.log(buf1.compare(buf2, 5, 9, 0, 4));
        * // Prints: 0
        * console.log(buf1.compare(buf2, 0, 6, 4));
        * // Prints: -1
        * console.log(buf1.compare(buf2, 5, 6, 5));
        * // Prints: 1
        * ```
        *
        * `ERR_OUT_OF_RANGE` is thrown if `targetStart < 0`, `sourceStart < 0`,`targetEnd > target.byteLength`, or `sourceEnd > source.byteLength`.
        * @since v0.11.13
        * @param target A `Buffer` or {@link Uint8Array} with which to compare `buf`.
        * @param targetStart The offset within `target` at which to begin comparison.
        * @param targetEnd The offset within `target` at which to end comparison (not inclusive).
        * @param sourceStart The offset within `buf` at which to begin comparison.
        * @param sourceEnd The offset within `buf` at which to end comparison (not inclusive).
        */
      def compare(otherBuffer: js.typedarray.Uint8Array): Double = js.native
      def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Double): Double = js.native
      def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Double): Double = js.native
      def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Double, sourceStart: Double): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Double,
        targetEnd: Double,
        sourceStart: Double,
        sourceEnd: Double
      ): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Double,
        targetEnd: Double,
        sourceStart: Unit,
        sourceEnd: Double
      ): Double = js.native
      def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Double, targetEnd: Unit, sourceStart: Double): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Double,
        targetEnd: Unit,
        sourceStart: Double,
        sourceEnd: Double
      ): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Double,
        targetEnd: Unit,
        sourceStart: Unit,
        sourceEnd: Double
      ): Double = js.native
      def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Unit, targetEnd: Double): Double = js.native
      def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Unit, targetEnd: Double, sourceStart: Double): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Unit,
        targetEnd: Double,
        sourceStart: Double,
        sourceEnd: Double
      ): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Unit,
        targetEnd: Double,
        sourceStart: Unit,
        sourceEnd: Double
      ): Double = js.native
      def compare(otherBuffer: js.typedarray.Uint8Array, targetStart: Unit, targetEnd: Unit, sourceStart: Double): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Unit,
        targetEnd: Unit,
        sourceStart: Double,
        sourceEnd: Double
      ): Double = js.native
      def compare(
        otherBuffer: js.typedarray.Uint8Array,
        targetStart: Unit,
        targetEnd: Unit,
        sourceStart: Unit,
        sourceEnd: Double
      ): Double = js.native
      
      /**
        * Copies data from a region of `buf` to a region in `target`, even if the `target`memory region overlaps with `buf`.
        *
        * [`TypedArray.prototype.set()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/set) performs the same operation, and is available
        * for all TypedArrays, including Node.js `Buffer`s, although it takes
        * different function arguments.
        *
        * ```js
        * // Create two `Buffer` instances.
        * const buf1 = Buffer.allocUnsafe(26);
        * const buf2 = Buffer.allocUnsafe(26).fill('!');
        *
        * for (let i = 0; i < 26; i++) {
        *   // 97 is the decimal ASCII value for 'a'.
        *   buf1[i] = i + 97;
        * }
        *
        * // Copy `buf1` bytes 16 through 19 into `buf2` starting at byte 8 of `buf2`.
        * buf1.copy(buf2, 8, 16, 20);
        * // This is equivalent to:
        * // buf2.set(buf1.subarray(16, 20), 8);
        *
        * console.log(buf2.toString('ascii', 0, 25));
        * // Prints: !!!!!!!!qrst!!!!!!!!!!!!!
        * ```
        *
        * ```js
        * // Create a `Buffer` and copy data from one region to an overlapping region
        * // within the same `Buffer`.
        *
        * const buf = Buffer.allocUnsafe(26);
        *
        * for (let i = 0; i < 26; i++) {
        *   // 97 is the decimal ASCII value for 'a'.
        *   buf[i] = i + 97;
        * }
        *
        * buf.copy(buf, 0, 4, 10);
        *
        * console.log(buf.toString());
        * // Prints: efghijghijklmnopqrstuvwxyz
        * ```
        * @since v0.1.90
        * @param target A `Buffer` or {@link Uint8Array} to copy into.
        * @param targetStart The offset within `target` at which to begin writing.
        * @param sourceStart The offset within `buf` from which to begin copying.
        * @param sourceEnd The offset within `buf` at which to stop copying (not inclusive).
        * @return The number of bytes copied.
        */
      def copy(targetBuffer: js.typedarray.Uint8Array): Double = js.native
      def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Double): Double = js.native
      def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Double, sourceStart: Double): Double = js.native
      def copy(
        targetBuffer: js.typedarray.Uint8Array,
        targetStart: Double,
        sourceStart: Double,
        sourceEnd: Double
      ): Double = js.native
      def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
      def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Unit, sourceStart: Double): Double = js.native
      def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
      def copy(targetBuffer: js.typedarray.Uint8Array, targetStart: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
      
      /**
        * Returns `true` if both `buf` and `otherBuffer` have exactly the same bytes,`false` otherwise. Equivalent to `buf.compare(otherBuffer) === 0`.
        *
        * ```js
        * const buf1 = Buffer.from('ABC');
        * const buf2 = Buffer.from('414243', 'hex');
        * const buf3 = Buffer.from('ABCD');
        *
        * console.log(buf1.equals(buf2));
        * // Prints: true
        * console.log(buf1.equals(buf3));
        * // Prints: false
        * ```
        * @since v0.11.13
        * @param otherBuffer A `Buffer` or {@link Uint8Array} with which to compare `buf`.
        */
      def equals(otherBuffer: js.typedarray.Uint8Array): Boolean = js.native
      
      /**
        * Fills `buf` with the specified `value`. If the `offset` and `end` are not given,
        * the entire `buf` will be filled:
        *
        * ```js
        * // Fill a `Buffer` with the ASCII character 'h'.
        *
        * const b = Buffer.allocUnsafe(50).fill('h');
        *
        * console.log(b.toString());
        * // Prints: hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
        * ```
        *
        * `value` is coerced to a `uint32` value if it is not a string, `Buffer`, or
        * integer. If the resulting integer is greater than `255` (decimal), `buf` will be
        * filled with `value &#x26; 255`.
        *
        * If the final write of a `fill()` operation falls on a multi-byte character,
        * then only the bytes of that character that fit into `buf` are written:
        *
        * ```js
        * // Fill a `Buffer` with character that takes up two bytes in UTF-8.
        *
        * console.log(Buffer.allocUnsafe(5).fill('\\u0222'));
        * // Prints: <Buffer c8 a2 c8 a2 c8>
        * ```
        *
        * If `value` contains invalid characters, it is truncated; if no valid
        * fill data remains, an exception is thrown:
        *
        * ```js
        * const buf = Buffer.allocUnsafe(5);
        *
        * console.log(buf.fill('a'));
        * // Prints: <Buffer 61 61 61 61 61>
        * console.log(buf.fill('aazz', 'hex'));
        * // Prints: <Buffer aa aa aa aa aa>
        * console.log(buf.fill('zz', 'hex'));
        * // Throws an exception.
        * ```
        * @since v0.5.0
        * @param value The value with which to fill `buf`.
        * @param offset Number of bytes to skip before starting to fill `buf`.
        * @param end Where to stop filling `buf` (not inclusive).
        * @param encoding The encoding for `value` if `value` is a string.
        * @return A reference to `buf`.
        */
      def fill(value: java.lang.String): this.type = js.native
      def fill(value: java.lang.String, offset: Double): this.type = js.native
      def fill(value: java.lang.String, offset: Double, end: Double): this.type = js.native
      def fill(value: java.lang.String, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
      def fill(value: java.lang.String, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
      def fill(value: java.lang.String, offset: Unit, end: Double): this.type = js.native
      def fill(value: java.lang.String, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
      def fill(value: java.lang.String, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
      def fill(value: js.typedarray.Uint8Array): this.type = js.native
      def fill(value: js.typedarray.Uint8Array, offset: Double): this.type = js.native
      def fill(value: js.typedarray.Uint8Array, offset: Double, end: Double): this.type = js.native
      def fill(value: js.typedarray.Uint8Array, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
      def fill(value: js.typedarray.Uint8Array, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
      def fill(value: js.typedarray.Uint8Array, offset: Unit, end: Double): this.type = js.native
      def fill(value: js.typedarray.Uint8Array, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
      def fill(value: js.typedarray.Uint8Array, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
      def fill(value: Double, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
      def fill(value: Double, offset: Double, end: Unit, encoding: BufferEncoding): this.type = js.native
      def fill(value: Double, offset: Unit, end: Double, encoding: BufferEncoding): this.type = js.native
      def fill(value: Double, offset: Unit, end: Unit, encoding: BufferEncoding): this.type = js.native
      
      /**
        * Equivalent to `buf.indexOf() !== -1`.
        *
        * ```js
        * const buf = Buffer.from('this is a buffer');
        *
        * console.log(buf.includes('this'));
        * // Prints: true
        * console.log(buf.includes('is'));
        * // Prints: true
        * console.log(buf.includes(Buffer.from('a buffer')));
        * // Prints: true
        * console.log(buf.includes(97));
        * // Prints: true (97 is the decimal ASCII value for 'a')
        * console.log(buf.includes(Buffer.from('a buffer example')));
        * // Prints: false
        * console.log(buf.includes(Buffer.from('a buffer example').slice(0, 8)));
        * // Prints: true
        * console.log(buf.includes('this', 4));
        * // Prints: false
        * ```
        * @since v5.3.0
        * @param value What to search for.
        * @param byteOffset Where to begin searching in `buf`. If negative, then offset is calculated from the end of `buf`.
        * @param encoding If `value` is a string, this is its encoding.
        * @return `true` if `value` was found in `buf`, `false` otherwise.
        */
      def includes(value: java.lang.String): Boolean = js.native
      def includes(value: java.lang.String, byteOffset: Double): Boolean = js.native
      def includes(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
      def includes(value: java.lang.String, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
      def includes(value: Double, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
      def includes(value: Double, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
      def includes(value: Buffer): Boolean = js.native
      def includes(value: Buffer, byteOffset: Double): Boolean = js.native
      def includes(value: Buffer, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
      def includes(value: Buffer, byteOffset: Unit, encoding: BufferEncoding): Boolean = js.native
      
      /**
        * If `value` is:
        *
        * * a string, `value` is interpreted according to the character encoding in`encoding`.
        * * a `Buffer` or [`Uint8Array`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array), `value` will be used in its entirety.
        * To compare a partial `Buffer`, use `buf.slice()`.
        * * a number, `value` will be interpreted as an unsigned 8-bit integer
        * value between `0` and `255`.
        *
        * ```js
        * const buf = Buffer.from('this is a buffer');
        *
        * console.log(buf.indexOf('this'));
        * // Prints: 0
        * console.log(buf.indexOf('is'));
        * // Prints: 2
        * console.log(buf.indexOf(Buffer.from('a buffer')));
        * // Prints: 8
        * console.log(buf.indexOf(97));
        * // Prints: 8 (97 is the decimal ASCII value for 'a')
        * console.log(buf.indexOf(Buffer.from('a buffer example')));
        * // Prints: -1
        * console.log(buf.indexOf(Buffer.from('a buffer example').slice(0, 8)));
        * // Prints: 8
        *
        * const utf16Buffer = Buffer.from('\\u039a\\u0391\\u03a3\\u03a3\\u0395', 'utf16le');
        *
        * console.log(utf16Buffer.indexOf('\\u03a3', 0, 'utf16le'));
        * // Prints: 4
        * console.log(utf16Buffer.indexOf('\\u03a3', -4, 'utf16le'));
        * // Prints: 6
        * ```
        *
        * If `value` is not a string, number, or `Buffer`, this method will throw a`TypeError`. If `value` is a number, it will be coerced to a valid byte value,
        * an integer between 0 and 255.
        *
        * If `byteOffset` is not a number, it will be coerced to a number. If the result
        * of coercion is `NaN` or `0`, then the entire buffer will be searched. This
        * behavior matches [`String.prototype.indexOf()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf).
        *
        * ```js
        * const b = Buffer.from('abcdef');
        *
        * // Passing a value that's a number, but not a valid byte.
        * // Prints: 2, equivalent to searching for 99 or 'c'.
        * console.log(b.indexOf(99.9));
        * console.log(b.indexOf(256 + 99));
        *
        * // Passing a byteOffset that coerces to NaN or 0.
        * // Prints: 1, searching the whole buffer.
        * console.log(b.indexOf('b', undefined));
        * console.log(b.indexOf('b', {}));
        * console.log(b.indexOf('b', null));
        * console.log(b.indexOf('b', []));
        * ```
        *
        * If `value` is an empty string or empty `Buffer` and `byteOffset` is less
        * than `buf.length`, `byteOffset` will be returned. If `value` is empty and`byteOffset` is at least `buf.length`, `buf.length` will be returned.
        * @since v1.5.0
        * @param value What to search for.
        * @param byteOffset Where to begin searching in `buf`. If negative, then offset is calculated from the end of `buf`.
        * @param encoding If `value` is a string, this is the encoding used to determine the binary representation of the string that will be searched for in `buf`.
        * @return The index of the first occurrence of `value` in `buf`, or `-1` if `buf` does not contain `value`.
        */
      def indexOf(value: java.lang.String): Double = js.native
      def indexOf(value: java.lang.String, byteOffset: Double): Double = js.native
      def indexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
      def indexOf(value: java.lang.String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
      def indexOf(value: js.typedarray.Uint8Array): Double = js.native
      def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
      def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
      def indexOf(value: js.typedarray.Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
      def indexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
      def indexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
      
      /**
        * Identical to `buf.indexOf()`, except the last occurrence of `value` is found
        * rather than the first occurrence.
        *
        * ```js
        * const buf = Buffer.from('this buffer is a buffer');
        *
        * console.log(buf.lastIndexOf('this'));
        * // Prints: 0
        * console.log(buf.lastIndexOf('buffer'));
        * // Prints: 17
        * console.log(buf.lastIndexOf(Buffer.from('buffer')));
        * // Prints: 17
        * console.log(buf.lastIndexOf(97));
        * // Prints: 15 (97 is the decimal ASCII value for 'a')
        * console.log(buf.lastIndexOf(Buffer.from('yolo')));
        * // Prints: -1
        * console.log(buf.lastIndexOf('buffer', 5));
        * // Prints: 5
        * console.log(buf.lastIndexOf('buffer', 4));
        * // Prints: -1
        *
        * const utf16Buffer = Buffer.from('\\u039a\\u0391\\u03a3\\u03a3\\u0395', 'utf16le');
        *
        * console.log(utf16Buffer.lastIndexOf('\\u03a3', undefined, 'utf16le'));
        * // Prints: 6
        * console.log(utf16Buffer.lastIndexOf('\\u03a3', -5, 'utf16le'));
        * // Prints: 4
        * ```
        *
        * If `value` is not a string, number, or `Buffer`, this method will throw a`TypeError`. If `value` is a number, it will be coerced to a valid byte value,
        * an integer between 0 and 255.
        *
        * If `byteOffset` is not a number, it will be coerced to a number. Any arguments
        * that coerce to `NaN`, like `{}` or `undefined`, will search the whole buffer.
        * This behavior matches [`String.prototype.lastIndexOf()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf).
        *
        * ```js
        * const b = Buffer.from('abcdef');
        *
        * // Passing a value that's a number, but not a valid byte.
        * // Prints: 2, equivalent to searching for 99 or 'c'.
        * console.log(b.lastIndexOf(99.9));
        * console.log(b.lastIndexOf(256 + 99));
        *
        * // Passing a byteOffset that coerces to NaN.
        * // Prints: 1, searching the whole buffer.
        * console.log(b.lastIndexOf('b', undefined));
        * console.log(b.lastIndexOf('b', {}));
        *
        * // Passing a byteOffset that coerces to 0.
        * // Prints: -1, equivalent to passing 0.
        * console.log(b.lastIndexOf('b', null));
        * console.log(b.lastIndexOf('b', []));
        * ```
        *
        * If `value` is an empty string or empty `Buffer`, `byteOffset` will be returned.
        * @since v6.0.0
        * @param value What to search for.
        * @param byteOffset Where to begin searching in `buf`. If negative, then offset is calculated from the end of `buf`.
        * @param encoding If `value` is a string, this is the encoding used to determine the binary representation of the string that will be searched for in `buf`.
        * @return The index of the last occurrence of `value` in `buf`, or `-1` if `buf` does not contain `value`.
        */
      def lastIndexOf(value: java.lang.String): Double = js.native
      def lastIndexOf(value: java.lang.String, byteOffset: Double): Double = js.native
      def lastIndexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
      def lastIndexOf(value: java.lang.String, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
      def lastIndexOf(value: js.typedarray.Uint8Array): Double = js.native
      def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
      def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
      def lastIndexOf(value: js.typedarray.Uint8Array, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
      def lastIndexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
      def lastIndexOf(value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = js.native
      
      /**
        * Reads a signed, big-endian 64-bit integer from `buf` at the specified `offset`.
        *
        * Integers read from a `Buffer` are interpreted as two's complement signed
        * values.
        * @since v12.0.0, v10.20.0
        * @param offset Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
        */
      def readBigInt64BE(): js.BigInt = js.native
      def readBigInt64BE(offset: Double): js.BigInt = js.native
      
      /**
        * Reads a signed, little-endian 64-bit integer from `buf` at the specified`offset`.
        *
        * Integers read from a `Buffer` are interpreted as two's complement signed
        * values.
        * @since v12.0.0, v10.20.0
        * @param offset Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
        */
      def readBigInt64LE(): js.BigInt = js.native
      def readBigInt64LE(offset: Double): js.BigInt = js.native
      
      /**
        * Reads an unsigned, big-endian 64-bit integer from `buf` at the specified`offset`.
        *
        * This function is also available under the `readBigUint64BE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x00, 0x00, 0x00, 0x00, 0xff, 0xff, 0xff, 0xff]);
        *
        * console.log(buf.readBigUInt64BE(0));
        * // Prints: 4294967295n
        * ```
        * @since v12.0.0, v10.20.0
        * @param offset Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
        */
      def readBigUInt64BE(): js.BigInt = js.native
      def readBigUInt64BE(offset: Double): js.BigInt = js.native
      
      /**
        * Reads an unsigned, little-endian 64-bit integer from `buf` at the specified`offset`.
        *
        * This function is also available under the `readBigUint64LE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x00, 0x00, 0x00, 0x00, 0xff, 0xff, 0xff, 0xff]);
        *
        * console.log(buf.readBigUInt64LE(0));
        * // Prints: 18446744069414584320n
        * ```
        * @since v12.0.0, v10.20.0
        * @param offset Number of bytes to skip before starting to read. Must satisfy: `0 <= offset <= buf.length - 8`.
        */
      def readBigUInt64LE(): js.BigInt = js.native
      def readBigUInt64LE(offset: Double): js.BigInt = js.native
      
      /**
        * Reads a 64-bit, big-endian double from `buf` at the specified `offset`.
        *
        * ```js
        * const buf = Buffer.from([1, 2, 3, 4, 5, 6, 7, 8]);
        *
        * console.log(buf.readDoubleBE(0));
        * // Prints: 8.20788039913184e-304
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 8`.
        */
      def readDoubleBE(): Double = js.native
      def readDoubleBE(offset: Double): Double = js.native
      
      /**
        * Reads a 64-bit, little-endian double from `buf` at the specified `offset`.
        *
        * ```js
        * const buf = Buffer.from([1, 2, 3, 4, 5, 6, 7, 8]);
        *
        * console.log(buf.readDoubleLE(0));
        * // Prints: 5.447603722011605e-270
        * console.log(buf.readDoubleLE(1));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 8`.
        */
      def readDoubleLE(): Double = js.native
      def readDoubleLE(offset: Double): Double = js.native
      
      /**
        * Reads a 32-bit, big-endian float from `buf` at the specified `offset`.
        *
        * ```js
        * const buf = Buffer.from([1, 2, 3, 4]);
        *
        * console.log(buf.readFloatBE(0));
        * // Prints: 2.387939260590663e-38
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
        */
      def readFloatBE(): Double = js.native
      def readFloatBE(offset: Double): Double = js.native
      
      /**
        * Reads a 32-bit, little-endian float from `buf` at the specified `offset`.
        *
        * ```js
        * const buf = Buffer.from([1, 2, 3, 4]);
        *
        * console.log(buf.readFloatLE(0));
        * // Prints: 1.539989614439558e-36
        * console.log(buf.readFloatLE(1));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
        */
      def readFloatLE(): Double = js.native
      def readFloatLE(offset: Double): Double = js.native
      
      /**
        * Reads a signed, big-endian 16-bit integer from `buf` at the specified `offset`.
        *
        * Integers read from a `Buffer` are interpreted as two's complement signed values.
        *
        * ```js
        * const buf = Buffer.from([0, 5]);
        *
        * console.log(buf.readInt16BE(0));
        * // Prints: 5
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
        */
      def readInt16BE(): Double = js.native
      def readInt16BE(offset: Double): Double = js.native
      
      /**
        * Reads a signed, little-endian 16-bit integer from `buf` at the specified`offset`.
        *
        * Integers read from a `Buffer` are interpreted as two's complement signed values.
        *
        * ```js
        * const buf = Buffer.from([0, 5]);
        *
        * console.log(buf.readInt16LE(0));
        * // Prints: 1280
        * console.log(buf.readInt16LE(1));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
        */
      def readInt16LE(): Double = js.native
      def readInt16LE(offset: Double): Double = js.native
      
      /**
        * Reads a signed, big-endian 32-bit integer from `buf` at the specified `offset`.
        *
        * Integers read from a `Buffer` are interpreted as two's complement signed values.
        *
        * ```js
        * const buf = Buffer.from([0, 0, 0, 5]);
        *
        * console.log(buf.readInt32BE(0));
        * // Prints: 5
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
        */
      def readInt32BE(): Double = js.native
      def readInt32BE(offset: Double): Double = js.native
      
      /**
        * Reads a signed, little-endian 32-bit integer from `buf` at the specified`offset`.
        *
        * Integers read from a `Buffer` are interpreted as two's complement signed values.
        *
        * ```js
        * const buf = Buffer.from([0, 0, 0, 5]);
        *
        * console.log(buf.readInt32LE(0));
        * // Prints: 83886080
        * console.log(buf.readInt32LE(1));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
        */
      def readInt32LE(): Double = js.native
      def readInt32LE(offset: Double): Double = js.native
      
      /**
        * Reads a signed 8-bit integer from `buf` at the specified `offset`.
        *
        * Integers read from a `Buffer` are interpreted as two's complement signed values.
        *
        * ```js
        * const buf = Buffer.from([-1, 5]);
        *
        * console.log(buf.readInt8(0));
        * // Prints: -1
        * console.log(buf.readInt8(1));
        * // Prints: 5
        * console.log(buf.readInt8(2));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.5.0
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 1`.
        */
      def readInt8(): Double = js.native
      def readInt8(offset: Double): Double = js.native
      
      /**
        * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as a big-endian, two's complement signed value
        * supporting up to 48 bits of accuracy.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
        *
        * console.log(buf.readIntBE(0, 6).toString(16));
        * // Prints: 1234567890ab
        * console.log(buf.readIntBE(1, 6).toString(16));
        * // Throws ERR_OUT_OF_RANGE.
        * console.log(buf.readIntBE(1, 0).toString(16));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
        */
      def readIntBE(offset: Double, byteLength: Double): Double = js.native
      
      /**
        * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as a little-endian, two's complement signed value
        * supporting up to 48 bits of accuracy.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
        *
        * console.log(buf.readIntLE(0, 6).toString(16));
        * // Prints: -546f87a9cbee
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
        */
      def readIntLE(offset: Double, byteLength: Double): Double = js.native
      
      /**
        * Reads an unsigned, big-endian 16-bit integer from `buf` at the specified`offset`.
        *
        * This function is also available under the `readUint16BE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56]);
        *
        * console.log(buf.readUInt16BE(0).toString(16));
        * // Prints: 1234
        * console.log(buf.readUInt16BE(1).toString(16));
        * // Prints: 3456
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
        */
      def readUInt16BE(): Double = js.native
      def readUInt16BE(offset: Double): Double = js.native
      
      /**
        * Reads an unsigned, little-endian 16-bit integer from `buf` at the specified`offset`.
        *
        * This function is also available under the `readUint16LE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56]);
        *
        * console.log(buf.readUInt16LE(0).toString(16));
        * // Prints: 3412
        * console.log(buf.readUInt16LE(1).toString(16));
        * // Prints: 5634
        * console.log(buf.readUInt16LE(2).toString(16));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 2`.
        */
      def readUInt16LE(): Double = js.native
      def readUInt16LE(offset: Double): Double = js.native
      
      /**
        * Reads an unsigned, big-endian 32-bit integer from `buf` at the specified`offset`.
        *
        * This function is also available under the `readUint32BE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78]);
        *
        * console.log(buf.readUInt32BE(0).toString(16));
        * // Prints: 12345678
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
        */
      def readUInt32BE(): Double = js.native
      def readUInt32BE(offset: Double): Double = js.native
      
      /**
        * Reads an unsigned, little-endian 32-bit integer from `buf` at the specified`offset`.
        *
        * This function is also available under the `readUint32LE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78]);
        *
        * console.log(buf.readUInt32LE(0).toString(16));
        * // Prints: 78563412
        * console.log(buf.readUInt32LE(1).toString(16));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.5.5
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 4`.
        */
      def readUInt32LE(): Double = js.native
      def readUInt32LE(offset: Double): Double = js.native
      
      /**
        * Reads an unsigned 8-bit integer from `buf` at the specified `offset`.
        *
        * This function is also available under the `readUint8` alias.
        *
        * ```js
        * const buf = Buffer.from([1, -2]);
        *
        * console.log(buf.readUInt8(0));
        * // Prints: 1
        * console.log(buf.readUInt8(1));
        * // Prints: 254
        * console.log(buf.readUInt8(2));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.5.0
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - 1`.
        */
      def readUInt8(): Double = js.native
      def readUInt8(offset: Double): Double = js.native
      
      /**
        * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as an unsigned big-endian integer supporting
        * up to 48 bits of accuracy.
        *
        * This function is also available under the `readUintBE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
        *
        * console.log(buf.readUIntBE(0, 6).toString(16));
        * // Prints: 1234567890ab
        * console.log(buf.readUIntBE(1, 6).toString(16));
        * // Throws ERR_OUT_OF_RANGE.
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
        */
      def readUIntBE(offset: Double, byteLength: Double): Double = js.native
      
      /**
        * Reads `byteLength` number of bytes from `buf` at the specified `offset`and interprets the result as an unsigned, little-endian integer supporting
        * up to 48 bits of accuracy.
        *
        * This function is also available under the `readUintLE` alias.
        *
        * ```js
        * const buf = Buffer.from([0x12, 0x34, 0x56, 0x78, 0x90, 0xab]);
        *
        * console.log(buf.readUIntLE(0, 6).toString(16));
        * // Prints: ab9078563412
        * ```
        * @since v0.11.15
        * @param offset Number of bytes to skip before starting to read. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to read. Must satisfy `0 < byteLength <= 6`.
        */
      def readUIntLE(offset: Double, byteLength: Double): Double = js.native
      
      /**
        * Interprets `buf` as an array of unsigned 16-bit integers and swaps the
        * byte order _in-place_. Throws `ERR_INVALID_BUFFER_SIZE` if `buf.length` is not a multiple of 2.
        *
        * ```js
        * const buf1 = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8]);
        *
        * console.log(buf1);
        * // Prints: <Buffer 01 02 03 04 05 06 07 08>
        *
        * buf1.swap16();
        *
        * console.log(buf1);
        * // Prints: <Buffer 02 01 04 03 06 05 08 07>
        *
        * const buf2 = Buffer.from([0x1, 0x2, 0x3]);
        *
        * buf2.swap16();
        * // Throws ERR_INVALID_BUFFER_SIZE.
        * ```
        *
        * One convenient use of `buf.swap16()` is to perform a fast in-place conversion
        * between UTF-16 little-endian and UTF-16 big-endian:
        *
        * ```js
        * const buf = Buffer.from('This is little-endian UTF-16', 'utf16le');
        * buf.swap16(); // Convert to big-endian UTF-16 text.
        * ```
        * @since v5.10.0
        * @return A reference to `buf`.
        */
      def swap16(): Buffer = js.native
      
      /**
        * Interprets `buf` as an array of unsigned 32-bit integers and swaps the
        * byte order _in-place_. Throws `ERR_INVALID_BUFFER_SIZE` if `buf.length` is not a multiple of 4.
        *
        * ```js
        * const buf1 = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8]);
        *
        * console.log(buf1);
        * // Prints: <Buffer 01 02 03 04 05 06 07 08>
        *
        * buf1.swap32();
        *
        * console.log(buf1);
        * // Prints: <Buffer 04 03 02 01 08 07 06 05>
        *
        * const buf2 = Buffer.from([0x1, 0x2, 0x3]);
        *
        * buf2.swap32();
        * // Throws ERR_INVALID_BUFFER_SIZE.
        * ```
        * @since v5.10.0
        * @return A reference to `buf`.
        */
      def swap32(): Buffer = js.native
      
      /**
        * Interprets `buf` as an array of 64-bit numbers and swaps byte order _in-place_.
        * Throws `ERR_INVALID_BUFFER_SIZE` if `buf.length` is not a multiple of 8.
        *
        * ```js
        * const buf1 = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5, 0x6, 0x7, 0x8]);
        *
        * console.log(buf1);
        * // Prints: <Buffer 01 02 03 04 05 06 07 08>
        *
        * buf1.swap64();
        *
        * console.log(buf1);
        * // Prints: <Buffer 08 07 06 05 04 03 02 01>
        *
        * const buf2 = Buffer.from([0x1, 0x2, 0x3]);
        *
        * buf2.swap64();
        * // Throws ERR_INVALID_BUFFER_SIZE.
        * ```
        * @since v6.3.0
        * @return A reference to `buf`.
        */
      def swap64(): Buffer = js.native
      
      /**
        * Returns a JSON representation of `buf`. [`JSON.stringify()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify) implicitly calls
        * this function when stringifying a `Buffer` instance.
        *
        * `Buffer.from()` accepts objects in the format returned from this method.
        * In particular, `Buffer.from(buf.toJSON())` works like `Buffer.from(buf)`.
        *
        * ```js
        * const buf = Buffer.from([0x1, 0x2, 0x3, 0x4, 0x5]);
        * const json = JSON.stringify(buf);
        *
        * console.log(json);
        * // Prints: {"type":"Buffer","data":[1,2,3,4,5]}
        *
        * const copy = JSON.parse(json, (key, value) => {
        *   return value &#x26;&#x26; value.type === 'Buffer' ?
        *     Buffer.from(value) :
        *     value;
        * });
        *
        * console.log(copy);
        * // Prints: <Buffer 01 02 03 04 05>
        * ```
        * @since v0.9.2
        */
      def toJSON(): Data = js.native
      
      def toString(encoding: Unit, start: Double): java.lang.String = js.native
      def toString(encoding: Unit, start: Double, end: Double): java.lang.String = js.native
      def toString(encoding: Unit, start: Unit, end: Double): java.lang.String = js.native
      def toString(encoding: BufferEncoding): java.lang.String = js.native
      def toString(encoding: BufferEncoding, start: Double): java.lang.String = js.native
      def toString(encoding: BufferEncoding, start: Double, end: Double): java.lang.String = js.native
      def toString(encoding: BufferEncoding, start: Unit, end: Double): java.lang.String = js.native
      
      /**
        * Writes `string` to `buf` at `offset` according to the character encoding in`encoding`. The `length` parameter is the number of bytes to write. If `buf` did
        * not contain enough space to fit the entire string, only part of `string` will be
        * written. However, partially encoded characters will not be written.
        *
        * ```js
        * const buf = Buffer.alloc(256);
        *
        * const len = buf.write('\\u00bd + \\u00bc = \\u00be', 0);
        *
        * console.log(`${len} bytes: ${buf.toString('utf8', 0, len)}`);
        * // Prints: 12 bytes: ½ + ¼ = ¾
        *
        * const buffer = Buffer.alloc(10);
        *
        * const length = buffer.write('abcd', 8);
        *
        * console.log(`${length} bytes: ${buffer.toString('utf8', 8, 10)}`);
        * // Prints: 2 bytes : ab
        * ```
        * @since v0.1.90
        * @param string String to write to `buf`.
        * @param offset Number of bytes to skip before starting to write `string`.
        * @param length Maximum number of bytes to write (written bytes will not exceed `buf.length - offset`).
        * @param encoding The character encoding of `string`.
        * @return Number of bytes written.
        */
      def write(string: java.lang.String): Double = js.native
      def write(string: java.lang.String, encoding: BufferEncoding): Double = js.native
      def write(string: java.lang.String, offset: Double): Double = js.native
      def write(string: java.lang.String, offset: Double, encoding: BufferEncoding): Double = js.native
      def write(string: java.lang.String, offset: Double, length: Double): Double = js.native
      def write(string: java.lang.String, offset: Double, length: Double, encoding: BufferEncoding): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian.
        *
        * `value` is interpreted and written as a two's complement signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(8);
        *
        * buf.writeBigInt64BE(0x0102030405060708n, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 01 02 03 04 05 06 07 08>
        * ```
        * @since v12.0.0, v10.20.0
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
        * @return `offset` plus the number of bytes written.
        */
      def writeBigInt64BE(value: js.BigInt): Double = js.native
      def writeBigInt64BE(value: js.BigInt, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian.
        *
        * `value` is interpreted and written as a two's complement signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(8);
        *
        * buf.writeBigInt64LE(0x0102030405060708n, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 08 07 06 05 04 03 02 01>
        * ```
        * @since v12.0.0, v10.20.0
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
        * @return `offset` plus the number of bytes written.
        */
      def writeBigInt64LE(value: js.BigInt): Double = js.native
      def writeBigInt64LE(value: js.BigInt, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian.
        *
        * This function is also available under the `writeBigUint64BE` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(8);
        *
        * buf.writeBigUInt64BE(0xdecafafecacefaden, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer de ca fa fe ca ce fa de>
        * ```
        * @since v12.0.0, v10.20.0
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
        * @return `offset` plus the number of bytes written.
        */
      def writeBigUInt64BE(value: js.BigInt): Double = js.native
      def writeBigUInt64BE(value: js.BigInt, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian
        *
        * ```js
        * const buf = Buffer.allocUnsafe(8);
        *
        * buf.writeBigUInt64LE(0xdecafafecacefaden, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer de fa ce ca fe fa ca de>
        * ```
        *
        * This function is also available under the `writeBigUint64LE` alias.
        * @since v12.0.0, v10.20.0
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy: `0 <= offset <= buf.length - 8`.
        * @return `offset` plus the number of bytes written.
        */
      def writeBigUInt64LE(value: js.BigInt): Double = js.native
      def writeBigUInt64LE(value: js.BigInt, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a JavaScript number. Behavior is undefined when `value` is anything
        * other than a JavaScript number.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(8);
        *
        * buf.writeDoubleBE(123.456, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 40 5e dd 2f 1a 9f be 77>
        * ```
        * @since v0.11.15
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 8`.
        * @return `offset` plus the number of bytes written.
        */
      def writeDoubleBE(value: Double): Double = js.native
      def writeDoubleBE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a JavaScript number. Behavior is undefined when `value` is anything
        * other than a JavaScript number.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(8);
        *
        * buf.writeDoubleLE(123.456, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 77 be 9f 1a 2f dd 5e 40>
        * ```
        * @since v0.11.15
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 8`.
        * @return `offset` plus the number of bytes written.
        */
      def writeDoubleLE(value: Double): Double = js.native
      def writeDoubleLE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian. Behavior is
        * undefined when `value` is anything other than a JavaScript number.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeFloatBE(0xcafebabe, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 4f 4a fe bb>
        * ```
        * @since v0.11.15
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
        * @return `offset` plus the number of bytes written.
        */
      def writeFloatBE(value: Double): Double = js.native
      def writeFloatBE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian. Behavior is
        * undefined when `value` is anything other than a JavaScript number.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeFloatLE(0xcafebabe, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer bb fe 4a 4f>
        * ```
        * @since v0.11.15
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
        * @return `offset` plus the number of bytes written.
        */
      def writeFloatLE(value: Double): Double = js.native
      def writeFloatLE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian.  The `value`must be a valid signed 16-bit integer. Behavior is undefined when `value` is
        * anything other than a signed 16-bit integer.
        *
        * The `value` is interpreted and written as a two's complement signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(2);
        *
        * buf.writeInt16BE(0x0102, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 01 02>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
        * @return `offset` plus the number of bytes written.
        */
      def writeInt16BE(value: Double): Double = js.native
      def writeInt16BE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian.  The `value`must be a valid signed 16-bit integer. Behavior is undefined when `value` is
        * anything other than a signed 16-bit integer.
        *
        * The `value` is interpreted and written as a two's complement signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(2);
        *
        * buf.writeInt16LE(0x0304, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 04 03>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
        * @return `offset` plus the number of bytes written.
        */
      def writeInt16LE(value: Double): Double = js.native
      def writeInt16LE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a valid signed 32-bit integer. Behavior is undefined when `value` is
        * anything other than a signed 32-bit integer.
        *
        * The `value` is interpreted and written as a two's complement signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeInt32BE(0x01020304, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 01 02 03 04>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
        * @return `offset` plus the number of bytes written.
        */
      def writeInt32BE(value: Double): Double = js.native
      def writeInt32BE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a valid signed 32-bit integer. Behavior is undefined when `value` is
        * anything other than a signed 32-bit integer.
        *
        * The `value` is interpreted and written as a two's complement signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeInt32LE(0x05060708, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer 08 07 06 05>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
        * @return `offset` plus the number of bytes written.
        */
      def writeInt32LE(value: Double): Double = js.native
      def writeInt32LE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset`. `value` must be a valid
        * signed 8-bit integer. Behavior is undefined when `value` is anything other than
        * a signed 8-bit integer.
        *
        * `value` is interpreted and written as a two's complement signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(2);
        *
        * buf.writeInt8(2, 0);
        * buf.writeInt8(-2, 1);
        *
        * console.log(buf);
        * // Prints: <Buffer 02 fe>
        * ```
        * @since v0.5.0
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 1`.
        * @return `offset` plus the number of bytes written.
        */
      def writeInt8(value: Double): Double = js.native
      def writeInt8(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as big-endian. Supports up to 48 bits of accuracy. Behavior is undefined when`value` is anything other than a
        * signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(6);
        *
        * buf.writeIntBE(0x1234567890ab, 0, 6);
        *
        * console.log(buf);
        * // Prints: <Buffer 12 34 56 78 90 ab>
        * ```
        * @since v0.11.15
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
        * @return `offset` plus the number of bytes written.
        */
      def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
      
      /**
        * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as little-endian. Supports up to 48 bits of accuracy. Behavior is undefined
        * when `value` is anything other than a signed integer.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(6);
        *
        * buf.writeIntLE(0x1234567890ab, 0, 6);
        *
        * console.log(buf);
        * // Prints: <Buffer ab 90 78 56 34 12>
        * ```
        * @since v0.11.15
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
        * @return `offset` plus the number of bytes written.
        */
      def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a valid unsigned 16-bit integer. Behavior is undefined when `value`is anything other than an
        * unsigned 16-bit integer.
        *
        * This function is also available under the `writeUint16BE` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeUInt16BE(0xdead, 0);
        * buf.writeUInt16BE(0xbeef, 2);
        *
        * console.log(buf);
        * // Prints: <Buffer de ad be ef>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
        * @return `offset` plus the number of bytes written.
        */
      def writeUInt16BE(value: Double): Double = js.native
      def writeUInt16BE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a valid unsigned 16-bit integer. Behavior is undefined when `value` is
        * anything other than an unsigned 16-bit integer.
        *
        * This function is also available under the `writeUint16LE` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeUInt16LE(0xdead, 0);
        * buf.writeUInt16LE(0xbeef, 2);
        *
        * console.log(buf);
        * // Prints: <Buffer ad de ef be>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 2`.
        * @return `offset` plus the number of bytes written.
        */
      def writeUInt16LE(value: Double): Double = js.native
      def writeUInt16LE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as big-endian. The `value`must be a valid unsigned 32-bit integer. Behavior is undefined when `value`is anything other than an
        * unsigned 32-bit integer.
        *
        * This function is also available under the `writeUint32BE` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeUInt32BE(0xfeedface, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer fe ed fa ce>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
        * @return `offset` plus the number of bytes written.
        */
      def writeUInt32BE(value: Double): Double = js.native
      def writeUInt32BE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset` as little-endian. The `value`must be a valid unsigned 32-bit integer. Behavior is undefined when `value` is
        * anything other than an unsigned 32-bit integer.
        *
        * This function is also available under the `writeUint32LE` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeUInt32LE(0xfeedface, 0);
        *
        * console.log(buf);
        * // Prints: <Buffer ce fa ed fe>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 4`.
        * @return `offset` plus the number of bytes written.
        */
      def writeUInt32LE(value: Double): Double = js.native
      def writeUInt32LE(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `value` to `buf` at the specified `offset`. `value` must be a
        * valid unsigned 8-bit integer. Behavior is undefined when `value` is anything
        * other than an unsigned 8-bit integer.
        *
        * This function is also available under the `writeUint8` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(4);
        *
        * buf.writeUInt8(0x3, 0);
        * buf.writeUInt8(0x4, 1);
        * buf.writeUInt8(0x23, 2);
        * buf.writeUInt8(0x42, 3);
        *
        * console.log(buf);
        * // Prints: <Buffer 03 04 23 42>
        * ```
        * @since v0.5.0
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - 1`.
        * @return `offset` plus the number of bytes written.
        */
      def writeUInt8(value: Double): Double = js.native
      def writeUInt8(value: Double, offset: Double): Double = js.native
      
      /**
        * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as big-endian. Supports up to 48 bits of accuracy. Behavior is undefined
        * when `value` is anything other than an unsigned integer.
        *
        * This function is also available under the `writeUintBE` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(6);
        *
        * buf.writeUIntBE(0x1234567890ab, 0, 6);
        *
        * console.log(buf);
        * // Prints: <Buffer 12 34 56 78 90 ab>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
        * @return `offset` plus the number of bytes written.
        */
      def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
      
      /**
        * Writes `byteLength` bytes of `value` to `buf` at the specified `offset`as little-endian. Supports up to 48 bits of accuracy. Behavior is undefined
        * when `value` is anything other than an unsigned integer.
        *
        * This function is also available under the `writeUintLE` alias.
        *
        * ```js
        * const buf = Buffer.allocUnsafe(6);
        *
        * buf.writeUIntLE(0x1234567890ab, 0, 6);
        *
        * console.log(buf);
        * // Prints: <Buffer ab 90 78 56 34 12>
        * ```
        * @since v0.5.5
        * @param value Number to be written to `buf`.
        * @param offset Number of bytes to skip before starting to write. Must satisfy `0 <= offset <= buf.length - byteLength`.
        * @param byteLength Number of bytes to write. Must satisfy `0 < byteLength <= 6`.
        * @return `offset` plus the number of bytes written.
        */
      def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
    }
    @JSGlobal("Buffer")
    @js.native
    def Buffer: BufferConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Buffer")
    @js.native
    class BufferCls protected ()
      extends StObject
         with Buffer {
      /**
        * Produces a Buffer backed by the same allocated memory as
        * the given {ArrayBuffer}/{SharedArrayBuffer}.
        *
        *
        * @param arrayBuffer The ArrayBuffer with which to share memory.
        * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
        */
      def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
      def this(arrayBuffer: SharedArrayBuffer) = this()
      /**
        * Allocates a new buffer containing the given {array} of octets.
        *
        * @param array The octets to store.
        * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
        */
      def this(array: js.Array[js.Any]) = this()
      /**
        * Allocates a new buffer containing the given {array} of octets.
        *
        * @param array The octets to store.
        * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
        */
      def this(array: js.typedarray.Uint8Array) = this()
      /**
        * Copies the passed {buffer} data onto a new {Buffer} instance.
        *
        * @param buffer The buffer to copy.
        * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
        */
      def this(buffer: Buffer) = this()
      /**
        * Allocates a new buffer of {size} octets.
        *
        * @param size count of octets to allocate.
        * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
        */
      def this(size: Double) = this()
      /**
        * Allocates a new buffer containing the given {str}.
        *
        * @param str String to store in buffer.
        * @param encoding encoding to use, optional.  Default is 'utf8'
        * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
        */
      def this(str: java.lang.String) = this()
      def this(str: java.lang.String, encoding: BufferEncoding) = this()
    }
    
    @scala.inline
    def Buffer_=(x: BufferConstructor): Unit = js.Dynamic.global.updateDynamic("Buffer")(x.asInstanceOf[js.Any])
    
    /**
      * Decodes a string of Base64-encoded data into bytes, and encodes those bytes
      * into a string using Latin-1 (ISO-8859-1).
      *
      * The `data` may be any JavaScript-value that can be coerced into a string.
      *
      * **This function is only provided for compatibility with legacy web platform APIs**
      * **and should never be used in new code, because they use strings to represent**
      * **binary data and predate the introduction of typed arrays in JavaScript.**
      * **For code running using Node.js APIs, converting between base64-encoded strings**
      * **and binary data should be performed using `Buffer.from(str, 'base64')` and`buf.toString('base64')`.**
      * @since v15.13.0
      * @deprecated Use `Buffer.from(data, 'base64')` instead.
      * @param data The Base64-encoded input string.
      */
    @scala.inline
    def atob(input: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("atob")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /**
      * Decodes a string into bytes using Latin-1 (ISO-8859), and encodes those bytes
      * into a string using Base64.
      *
      * The `data` may be any JavaScript-value that can be coerced into a string.
      *
      * **This function is only provided for compatibility with legacy web platform APIs**
      * **and should never be used in new code, because they use strings to represent**
      * **binary data and predate the introduction of typed arrays in JavaScript.**
      * **For code running using Node.js APIs, converting between base64-encoded strings**
      * **and binary data should be performed using `Buffer.from(str, 'base64')` and`buf.toString('base64')`.**
      * @since v15.13.0
      * @deprecated Use `buf.toString('base64')` instead.
      * @param data An ASCII (Latin1) string.
      */
    @scala.inline
    def btoa(input: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("btoa")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    
    /**
      * Raw data is stored in instances of the Buffer class.
      * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
      * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      */
    @js.native
    trait BufferConstructor
      extends StObject
         with /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    Instantiable1[
              (/* array */ js.Array[js.Any]) | (/* arrayBuffer */ js.typedarray.ArrayBuffer) | (/* buffer */ Buffer) | (/* size */ Double) | (/* arrayBuffer */ SharedArrayBuffer) | (/* str */ java.lang.String) | (/* array */ js.typedarray.Uint8Array), 
              Buffer
            ]
         with Instantiable2[/* str */ java.lang.String, /* encoding */ BufferEncoding, Buffer] {
      
      /**
        * Allocates a new buffer of {size} octets.
        *
        * @param size count of octets to allocate.
        * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
        *    If parameter is omitted, buffer will be filled with zeros.
        * @param encoding encoding used for call to buf.fill while initalizing
        */
      def alloc(size: Double): Buffer = js.native
      def alloc(size: Double, fill: java.lang.String): Buffer = js.native
      def alloc(size: Double, fill: java.lang.String, encoding: BufferEncoding): Buffer = js.native
      def alloc(size: Double, fill: Double): Buffer = js.native
      def alloc(size: Double, fill: Double, encoding: BufferEncoding): Buffer = js.native
      def alloc(size: Double, fill: Unit, encoding: BufferEncoding): Buffer = js.native
      def alloc(size: Double, fill: Buffer): Buffer = js.native
      def alloc(size: Double, fill: Buffer, encoding: BufferEncoding): Buffer = js.native
      
      /**
        * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
        * of the newly created Buffer are unknown and may contain sensitive data.
        *
        * @param size count of octets to allocate
        */
      def allocUnsafe(size: Double): Buffer = js.native
      
      /**
        * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
        * of the newly created Buffer are unknown and may contain sensitive data.
        *
        * @param size count of octets to allocate
        */
      def allocUnsafeSlow(size: Double): Buffer = js.native
      
      /**
        * Gives the actual byte length of a string. encoding defaults to 'utf8'.
        * This is not the same as String.prototype.length since that returns the number of characters in a string.
        *
        * @param string string to test.
        * @param encoding encoding used to evaluate (defaults to 'utf8')
        */
      def byteLength(string: java.lang.String): Double = js.native
      def byteLength(string: java.lang.String, encoding: BufferEncoding): Double = js.native
      def byteLength(string: js.typedarray.ArrayBuffer): Double = js.native
      def byteLength(string: js.typedarray.ArrayBuffer, encoding: BufferEncoding): Double = js.native
      def byteLength(string: ArrayBufferView): Double = js.native
      def byteLength(string: ArrayBufferView, encoding: BufferEncoding): Double = js.native
      def byteLength(string: SharedArrayBuffer): Double = js.native
      def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = js.native
      
      /**
        * The same as buf1.compare(buf2).
        */
      def compare(buf1: js.typedarray.Uint8Array, buf2: js.typedarray.Uint8Array): Double = js.native
      
      /**
        * Returns a buffer which is the result of concatenating all the buffers in the list together.
        *
        * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
        * If the list has exactly one item, then the first item of the list is returned.
        * If the list has more than one item, then a new Buffer is created.
        *
        * @param list An array of Buffer objects to concatenate
        * @param totalLength Total length of the buffers when concatenated.
        *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
        */
      def concat(list: js.Array[js.typedarray.Uint8Array]): Buffer = js.native
      def concat(list: js.Array[js.typedarray.Uint8Array], totalLength: Double): Buffer = js.native
      
      /**
        * When passed a reference to the .buffer property of a TypedArray instance,
        * the newly created Buffer will share the same allocated memory as the TypedArray.
        * The optional {byteOffset} and {length} arguments specify a memory range
        * within the {arrayBuffer} that will be shared by the Buffer.
        *
        * @param arrayBuffer The .buffer property of any TypedArray or a new ArrayBuffer()
        */
      /**
        * Creates a new Buffer containing the given JavaScript string {str}.
        * If provided, the {encoding} parameter identifies the character encoding.
        * If not provided, {encoding} defaults to 'utf8'.
        */
      def from(
        arrayBuffer: WithImplicitCoercion[
              js.Array[Double] | js.typedarray.ArrayBuffer | SharedArrayBuffer | java.lang.String | js.typedarray.Uint8Array
            ]
      ): Buffer = js.native
      def from(
        arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
        byteOffset: Double
      ): Buffer = js.native
      def from(
        arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
        byteOffset: Double,
        length: Double
      ): Buffer = js.native
      def from(
        arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
        byteOffset: Unit,
        length: Double
      ): Buffer = js.native
      def from(data: js.Array[Double]): Buffer = js.native
      /**
        * Creates a new Buffer using the passed {data}
        * @param data data to create a new Buffer
        */
      def from(data: js.typedarray.Uint8Array): Buffer = js.native
      def from(str: ToPrimitive): Buffer = js.native
      def from(str: ToPrimitive, encoding: BufferEncoding): Buffer = js.native
      def from(str: WithImplicitCoercion[java.lang.String], encoding: BufferEncoding): Buffer = js.native
      
      /**
        * Returns true if {obj} is a Buffer
        *
        * @param obj object to test.
        */
      def isBuffer(obj: js.Any): /* is node.buffer.<global>.Buffer */ Boolean = js.native
      
      /**
        * Returns true if {encoding} is a valid encoding argument.
        * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
        *
        * @param encoding string to test.
        */
      def isEncoding(encoding: java.lang.String): /* is node.buffer.<global>.BufferEncoding */ Boolean = js.native
      
      /**
        * Creates a new Buffer using the passed {data}
        * @param values to create a new Buffer
        */
      def of(items: Double*): Buffer = js.native
      
      /**
        * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
        */
      var poolSize: Double = js.native
    }
    
    // Buffer class
    /* Rewritten from type alias, can be one of: 
      - tmttyped.node.nodeStrings.ascii
      - tmttyped.node.nodeStrings.utf8
      - tmttyped.node.nodeStrings.`utf-8`
      - tmttyped.node.nodeStrings.utf16le
      - tmttyped.node.nodeStrings.ucs2
      - tmttyped.node.nodeStrings.`ucs-2`
      - tmttyped.node.nodeStrings.base64
      - tmttyped.node.nodeStrings.base64url
      - tmttyped.node.nodeStrings.latin1
      - tmttyped.node.nodeStrings.binary
      - tmttyped.node.nodeStrings.hex
    */
    trait BufferEncoding
      extends StObject
         with _EncodingOption
    object BufferEncoding {
      
      @scala.inline
      def ascii: tmttyped.node.nodeStrings.ascii = "ascii".asInstanceOf[tmttyped.node.nodeStrings.ascii]
      
      @scala.inline
      def base64: tmttyped.node.nodeStrings.base64 = "base64".asInstanceOf[tmttyped.node.nodeStrings.base64]
      
      @scala.inline
      def base64url: tmttyped.node.nodeStrings.base64url = "base64url".asInstanceOf[tmttyped.node.nodeStrings.base64url]
      
      @scala.inline
      def binary: tmttyped.node.nodeStrings.binary = "binary".asInstanceOf[tmttyped.node.nodeStrings.binary]
      
      @scala.inline
      def hex: tmttyped.node.nodeStrings.hex = "hex".asInstanceOf[tmttyped.node.nodeStrings.hex]
      
      @scala.inline
      def latin1: tmttyped.node.nodeStrings.latin1 = "latin1".asInstanceOf[tmttyped.node.nodeStrings.latin1]
      
      @scala.inline
      def `ucs-2`: tmttyped.node.nodeStrings.`ucs-2` = "ucs-2".asInstanceOf[tmttyped.node.nodeStrings.`ucs-2`]
      
      @scala.inline
      def ucs2: tmttyped.node.nodeStrings.ucs2 = "ucs2".asInstanceOf[tmttyped.node.nodeStrings.ucs2]
      
      @scala.inline
      def `utf-8`: tmttyped.node.nodeStrings.`utf-8` = "utf-8".asInstanceOf[tmttyped.node.nodeStrings.`utf-8`]
      
      @scala.inline
      def utf16le: tmttyped.node.nodeStrings.utf16le = "utf16le".asInstanceOf[tmttyped.node.nodeStrings.utf16le]
      
      @scala.inline
      def utf8: tmttyped.node.nodeStrings.utf8 = "utf8".asInstanceOf[tmttyped.node.nodeStrings.utf8]
    }
    
    type WithImplicitCoercion[T] = T | ValueOf[T]
  }
  
  @JSImport("buffer", "kMaxLength")
  @js.native
  val kMaxLength: Double = js.native
  
  @JSImport("buffer", "kStringMaxLength")
  @js.native
  val kStringMaxLength: Double = js.native
  
  @scala.inline
  def transcode(source: js.typedarray.Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(source.asInstanceOf[js.Any], fromEnc.asInstanceOf[js.Any], toEnc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait BlobOptions extends StObject {
    
    /**
      * @default 'utf8'
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * The Blob content-type. The intent is for `type` to convey
      * the MIME media type of the data, however no validation of the type format
      * is performed.
      */
    var `type`: js.UndefOr[java.lang.String] = js.undefined
  }
  object BlobOptions {
    
    @scala.inline
    def apply(): BlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobOptions]
    }
    
    @scala.inline
    implicit class BlobOptionsMutableBuilder[Self <: BlobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - tmttyped.node.nodeStrings.ascii
    - tmttyped.node.nodeStrings.utf8
    - tmttyped.node.nodeStrings.utf16le
    - tmttyped.node.nodeStrings.ucs2
    - tmttyped.node.nodeStrings.latin1
    - tmttyped.node.nodeStrings.binary
  */
  trait TranscodeEncoding extends StObject
  object TranscodeEncoding {
    
    @scala.inline
    def ascii: tmttyped.node.nodeStrings.ascii = "ascii".asInstanceOf[tmttyped.node.nodeStrings.ascii]
    
    @scala.inline
    def binary: tmttyped.node.nodeStrings.binary = "binary".asInstanceOf[tmttyped.node.nodeStrings.binary]
    
    @scala.inline
    def latin1: tmttyped.node.nodeStrings.latin1 = "latin1".asInstanceOf[tmttyped.node.nodeStrings.latin1]
    
    @scala.inline
    def ucs2: tmttyped.node.nodeStrings.ucs2 = "ucs2".asInstanceOf[tmttyped.node.nodeStrings.ucs2]
    
    @scala.inline
    def utf16le: tmttyped.node.nodeStrings.utf16le = "utf16le".asInstanceOf[tmttyped.node.nodeStrings.utf16le]
    
    @scala.inline
    def utf8: tmttyped.node.nodeStrings.utf8 = "utf8".asInstanceOf[tmttyped.node.nodeStrings.utf8]
  }
}
