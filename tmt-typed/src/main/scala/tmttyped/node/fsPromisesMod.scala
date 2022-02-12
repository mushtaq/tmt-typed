package tmttyped.node

import tmttyped.node.NodeJS.ArrayBufferView
import tmttyped.node.anon.BytesWritten
import tmttyped.node.anon.Encoding
import tmttyped.node.anon.EncodingBufferEncoding
import tmttyped.node.anon.MakeDirectoryOptionsrecur
import tmttyped.node.anon.MakeDirectoryOptionsrecurMode
import tmttyped.node.anon.ObjectEncodingOptionsAbor
import tmttyped.node.anon.ObjectEncodingOptionsflagFlag
import tmttyped.node.anon.ObjectEncodingOptionsmode
import tmttyped.node.anon.ObjectEncodingOptionswith
import tmttyped.node.anon.ObjectEncodingOptionswithEncoding
import tmttyped.node.anon.StatOptionsbigintfalseund
import tmttyped.node.anon.StatOptionsbiginttrue
import tmttyped.node.anon.WatchOptionsencodingbuffe
import tmttyped.node.anon.`3`
import tmttyped.node.anon.encodingBufferEncodingfla
import tmttyped.node.anon.encodingnullundefinedflag
import tmttyped.node.bufferMod.global.Buffer
import tmttyped.node.bufferMod.global.BufferEncoding
import tmttyped.node.eventsMod.Abortable
import tmttyped.node.fsMod.BigIntStats
import tmttyped.node.fsMod.BufferEncodingOption
import tmttyped.node.fsMod.CopyOptions
import tmttyped.node.fsMod.MakeDirectoryOptions
import tmttyped.node.fsMod.Mode
import tmttyped.node.fsMod.ObjectEncodingOptions
import tmttyped.node.fsMod.OpenDirOptions
import tmttyped.node.fsMod.OpenMode
import tmttyped.node.fsMod.PathLike
import tmttyped.node.fsMod.ReadVResult
import tmttyped.node.fsMod.RmDirOptions
import tmttyped.node.fsMod.RmOptions
import tmttyped.node.fsMod.StatOptions
import tmttyped.node.fsMod.WatchEventType
import tmttyped.node.fsMod.WatchOptions
import tmttyped.node.fsMod.WriteVResult
import tmttyped.node.nodeFsMod.Dir
import tmttyped.node.nodeFsMod.Dirent
import tmttyped.node.nodeFsMod.ReadStream
import tmttyped.node.nodeFsMod.Stats
import tmttyped.node.nodeFsMod.WriteStream
import tmttyped.node.nodeStreamMod.Stream
import tmttyped.node.nodeStrings.buffer_
import tmttyped.node.workerThreadsMod._TransferListItem
import tmttyped.std.AsyncIterable
import tmttyped.std.BigInt64Array
import tmttyped.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsPromisesMod {
  
  @JSImport("fs/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tests a user's permissions for the file or directory specified by `path`.
    * The `mode` argument is an optional integer that specifies the accessibility
    * checks to be performed. Check `File access constants` for possible values
    * of `mode`. It is possible to create a mask consisting of the bitwise OR of
    * two or more values (e.g. `fs.constants.W_OK | fs.constants.R_OK`).
    *
    * If the accessibility check is successful, the promise is resolved with no
    * value. If any of the accessibility checks fail, the promise is rejected
    * with an [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object. The following example checks if the file`/etc/passwd` can be read and
    * written by the current process.
    *
    * ```js
    * import { access } from 'fs/promises';
    * import { constants } from 'fs';
    *
    * try {
    *   await access('/etc/passwd', constants.R_OK | constants.W_OK);
    *   console.log('can access');
    * } catch {
    *   console.error('cannot access');
    * }
    * ```
    *
    * Using `fsPromises.access()` to check for the accessibility of a file before
    * calling `fsPromises.open()` is not recommended. Doing so introduces a race
    * condition, since other processes may change the file's state between the two
    * calls. Instead, user code should open/read/write the file directly and handle
    * the error raised if the file is not accessible.
    * @since v10.0.0
    * @param [mode=fs.constants.F_OK]
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously append data to a file, creating the file if it does not yet
    * exist. `data` can be a string or a `Buffer`.
    *
    * If `options` is a string, then it specifies the `encoding`.
    *
    * The `mode` option only affects the newly created file. See `fs.open()` for more details.
    *
    * The `path` may be specified as a `FileHandle` that has been opened
    * for appending (using `fsPromises.open()`).
    * @since v10.0.0
    * @param path filename or {FileHandle}
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def appendFile(path: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: String, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(
    path: PathLike,
    data: js.typedarray.Uint8Array,
    options: ObjectEncodingOptions with FlagAndOpenMode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: String, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(
    path: FileHandle,
    data: js.typedarray.Uint8Array,
    options: ObjectEncodingOptions with FlagAndOpenMode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the permissions of a file.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the ownership of a file.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it
    * already exists.
    *
    * No guarantees are made about the atomicity of the copy operation. If an
    * error occurs after the destination file has been opened for writing, an attempt
    * will be made to remove the destination.
    *
    * ```js
    * import { constants } from 'fs';
    * import { copyFile } from 'fs/promises';
    *
    * try {
    *   await copyFile('source.txt', 'destination.txt');
    *   console.log('source.txt was copied to destination.txt');
    * } catch {
    *   console.log('The file could not be copied');
    * }
    *
    * // By using COPYFILE_EXCL, the operation will fail if destination.txt exists.
    * try {
    *   await copyFile('source.txt', 'destination.txt', constants.COPYFILE_EXCL);
    *   console.log('source.txt was copied to destination.txt');
    * } catch {
    *   console.log('The file could not be copied');
    * }
    * ```
    * @since v10.0.0
    * @param src source filename to copy
    * @param dest destination filename of the copy operation
    * @param [mode=0] Optional modifiers that specify the behavior of the copy operation. It is possible to create a mask consisting of the bitwise OR of two or more values (e.g.
    * `fs.constants.COPYFILE_EXCL | fs.constants.COPYFILE_FICLONE`)
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def copyFile(src: PathLike, dest: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously copies the entire directory structure from `src` to `dest`,
    * including subdirectories and files.
    *
    * When copying a directory to another directory, globs are not supported and
    * behavior is similar to `cp dir1/ dir2/`.
    * @since v16.7.0
    * @experimental
    * @param src source path to copy.
    * @param dest destination path to copy to.
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def cp(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def cp(source: String, destination: String, opts: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the permissions on a symbolic link.
    *
    * This method is only implemented on macOS.
    * @deprecated Since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes the ownership on a symbolic link.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Creates a new link from the `existingPath` to the `newPath`. See the POSIX [`link(2)`](http://man7.org/linux/man-pages/man2/link.2.html) documentation for more detail.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Equivalent to `fsPromises.stat()` unless `path` refers to a symbolic link,
    * in which case the link itself is stat-ed, not the file that it refers to.
    * Refer to the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) document for more detail.
    * @since v10.0.0
    * @return Fulfills with the {fs.Stats} object for the given symbolic link `path`.
    */
  @scala.inline
  def lstat(path: PathLike): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def lstat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def lstat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
  @scala.inline
  def lstat(path: PathLike, opts: StatOptions): js.Promise[Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats | BigIntStats]]
  
  /**
    * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`, with the difference that if the path refers to a
    * symbolic link, then the link is not dereferenced: instead, the timestamps of
    * the symbolic link itself are changed.
    * @since v14.5.0, v12.19.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def lutimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @scala.inline
  def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Asynchronously creates a directory.
    *
    * The optional `options` argument can be an integer specifying `mode` (permission
    * and sticky bits), or an object with a `mode` property and a `recursive`property indicating whether parent directories should be created. Calling`fsPromises.mkdir()` when `path` is a directory
    * that exists results in a
    * rejection only when `recursive` is false.
    * @since v10.0.0
    * @return Upon success, fulfills with `undefined` if `recursive` is `false`, or the first directory path created if `recursive` is `true`.
    */
  @scala.inline
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Creates a unique temporary directory. A unique directory name is generated by
    * appending six random characters to the end of the provided `prefix`. Due to
    * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
    * platforms, notably the BSDs, can return more than six random characters, and
    * replace trailing `X` characters in `prefix` with random characters.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use.
    *
    * ```js
    * import { mkdtemp } from 'fs/promises';
    *
    * try {
    *   await mkdtemp(path.join(os.tmpdir(), 'foo-'));
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    *
    * The `fsPromises.mkdtemp()` method will append the six randomly selected
    * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
    * platform-specific path separator
    * (`require('path').sep`).
    * @since v10.0.0
    * @return Fulfills with a string containing the filesystem path of the newly created temporary directory.
    */
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def mkdtemp(prefix: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def mkdtemp(prefix: String, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Opens a `FileHandle`.
    *
    * Refer to the POSIX [`open(2)`](http://man7.org/linux/man-pages/man2/open.2.html) documentation for more detail.
    *
    * Some characters (`< > : " / \ | ? *`) are reserved under Windows as documented
    * by [Naming Files, Paths, and Namespaces](https://docs.microsoft.com/en-us/windows/desktop/FileIO/naming-a-file). Under NTFS, if the filename contains
    * a colon, Node.js will open a file system stream, as described by [this MSDN page](https://docs.microsoft.com/en-us/windows/desktop/FileIO/using-streams).
    * @since v10.0.0
    * @param [flags='r'] See `support of file system `flags``.
    * @param [mode=0o666] Sets the file mode (permission and sticky bits) if the file is created.
    * @return Fulfills with a {FileHandle} object.
    */
  @scala.inline
  def open(path: PathLike, flags: String): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  @scala.inline
  def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  @scala.inline
  def open(path: PathLike, flags: Double): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  @scala.inline
  def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  
  /**
    * Asynchronously open a directory for iterative scanning. See the POSIX [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html) documentation for more detail.
    *
    * Creates an `fs.Dir`, which contains all further functions for reading from
    * and cleaning up the directory.
    *
    * The `encoding` option sets the encoding for the `path` while opening the
    * directory and subsequent read operations.
    *
    * Example using async iteration:
    *
    * ```js
    * import { opendir } from 'fs/promises';
    *
    * try {
    *   const dir = await opendir('./');
    *   for await (const dirent of dir)
    *     console.log(dirent.name);
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    *
    * When using the async iterator, the `fs.Dir` object will be automatically
    * closed after the iterator exits.
    * @since v12.12.0
    * @return Fulfills with an {fs.Dir}.
    */
  @scala.inline
  def opendir(path: PathLike): js.Promise[Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Dir]]
  @scala.inline
  def opendir(path: PathLike, options: OpenDirOptions): js.Promise[Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Dir]]
  
  /**
    * Asynchronously reads the entire contents of a file.
    *
    * If no encoding is specified (using `options.encoding`), the data is returned
    * as a `Buffer` object. Otherwise, the data will be a string.
    *
    * If `options` is a string, then it specifies the encoding.
    *
    * When the `path` is a directory, the behavior of `fsPromises.readFile()` is
    * platform-specific. On macOS, Linux, and Windows, the promise will be rejected
    * with an error. On FreeBSD, a representation of the directory's contents will be
    * returned.
    *
    * It is possible to abort an ongoing `readFile` using an `AbortSignal`. If a
    * request is aborted the promise returned is rejected with an `AbortError`:
    *
    * ```js
    * import { readFile } from 'fs/promises';
    *
    * try {
    *   const controller = new AbortController();
    *   const { signal } = controller;
    *   const promise = readFile(fileName, { signal });
    *
    *   // Abort the request before the promise settles.
    *   controller.abort();
    *
    *   await promise;
    * } catch (err) {
    *   // When a request is aborted - err is an AbortError
    *   console.error(err);
    * }
    * ```
    *
    * Aborting an ongoing request does not abort individual operating
    * system requests but rather the internal buffering `fs.readFile` performs.
    *
    * Any specified `FileHandle` has to support reading.
    * @since v10.0.0
    * @param path filename or `FileHandle`
    * @return Fulfills with the contents of the file.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @scala.inline
  def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: PathLike, options: ObjectEncodingOptionsAbor): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @scala.inline
  def readFile(path: PathLike, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def readFile(path: PathLike, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def readFile(path: FileHandle): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: FileHandle, options: ObjectEncodingOptionsAbor): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  @scala.inline
  def readFile(path: FileHandle, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def readFile(path: FileHandle, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Reads the contents of a directory.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
    * will be passed as `Buffer` objects.
    *
    * If `options.withFileTypes` is set to `true`, the resolved array will contain `fs.Dirent` objects.
    *
    * ```js
    * import { readdir } from 'fs/promises';
    *
    * try {
    *   const files = await readdir(path);
    *   for (const file of files)
    *     console.log(file);
    * } catch (err) {
    *   console.error(err);
    * }
    * ```
    * @since v10.0.0
    * @return Fulfills with an array of the names of the files in the directory excluding `'.'` and `'..'`.
    */
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readdir(path: PathLike): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readdir(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  @scala.inline
  def readdir(path: PathLike, options: ObjectEncodingOptionswith): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  @scala.inline
  def readdir(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Promise[js.Array[Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Dirent]]]
  @scala.inline
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @scala.inline
  def readdir_buffer(path: PathLike, options: buffer_): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  /**
    * Reads the contents of the symbolic link referred to by `path`. See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more detail. The promise is
    * resolved with the`linkString` upon success.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the link path returned. If the `encoding` is set to `'buffer'`, the link path
    * returned will be passed as a `Buffer` object.
    * @since v10.0.0
    * @return Fulfills with the `linkString` upon success.
    */
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readlink(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  @scala.inline
  def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readlink(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Determines the actual location of `path` using the same semantics as the`fs.realpath.native()` function.
    *
    * Only paths that can be converted to UTF8 strings are supported.
    *
    * The optional `options` argument can be a string specifying an encoding, or an
    * object with an `encoding` property specifying the character encoding to use for
    * the path. If the `encoding` is set to `'buffer'`, the path returned will be
    * passed as a `Buffer` object.
    *
    * On Linux, when Node.js is linked against musl libc, the procfs file system must
    * be mounted on `/proc` in order for this function to work. Glibc does not have
    * this restriction.
    * @since v10.0.0
    * @return Fulfills with the resolved path upon success.
    */
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def realpath(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def realpath(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * Renames `oldPath` to `newPath`.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Removes files and directories (modeled on the standard POSIX `rm` utility).
    * @since v14.14.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Removes the directory identified by `path`.
    *
    * Using `fsPromises.rmdir()` on a file (not a directory) results in the
    * promise being rejected with an `ENOENT` error on Windows and an `ENOTDIR`error on POSIX.
    *
    * To get a behavior similar to the `rm -rf` Unix command, use `fsPromises.rm()` with options `{ recursive: true, force: true }`.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * @since v10.0.0
    * @return Fulfills with the {fs.Stats} object for the given `path`.
    */
  @scala.inline
  def stat(path: PathLike): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def stat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def stat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
  @scala.inline
  def stat(path: PathLike, opts: StatOptions): js.Promise[Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats | BigIntStats]]
  
  /**
    * Creates a symbolic link.
    *
    * The `type` argument is only used on Windows platforms and can be one of `'dir'`,`'file'`, or `'junction'`. Windows junction points require the destination path
    * to be absolute. When using `'junction'`, the `target` argument will
    * automatically be normalized to absolute path.
    * @since v10.0.0
    * @param [type='file']
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Truncates (shortens or extends the length) of the content at `path` to `len`bytes.
    * @since v10.0.0
    * @param [len=0]
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * If `path` refers to a symbolic link, then the link is removed without affecting
    * the file or directory to which that link refers. If the `path` refers to a file
    * path that is not a symbolic link, the file is deleted. See the POSIX [`unlink(2)`](http://man7.org/linux/man-pages/man2/unlink.2.html) documentation for more detail.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Change the file system timestamps of the object referenced by `path`.
    *
    * The `atime` and `mtime` arguments follow these rules:
    *
    * * Values can be either numbers representing Unix epoch time, `Date`s, or a
    * numeric string like `'123456789.0'`.
    * * If the value can not be converted to a number, or is `NaN`, `Infinity` or`-Infinity`, an `Error` will be thrown.
    * @since v10.0.0
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def utimes(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: String, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: js.Date, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  @scala.inline
  def watch(filename: PathLike): AsyncIterable[FileChangeInfo[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
  @scala.inline
  def watch(filename: PathLike, options: String): AsyncIterable[FileChangeInfo[Buffer | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer | String]]]
  /**
    * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
    *
    * ```js
    * const { watch } = require('fs/promises');
    *
    * const ac = new AbortController();
    * const { signal } = ac;
    * setTimeout(() => ac.abort(), 10000);
    *
    * (async () => {
    *   try {
    *     const watcher = watch(__filename, { signal });
    *     for await (const event of watcher)
    *       console.log(event);
    *   } catch (err) {
    *     if (err.name === 'AbortError')
    *       return;
    *     throw err;
    *   }
    * })();
    * ```
    *
    * On most platforms, `'rename'` is emitted whenever a filename appears or
    * disappears in the directory.
    *
    * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
    * @since v15.9.0, v14.18.0
    * @return of objects with the properties:
    */
  @scala.inline
  def watch(filename: PathLike, options: WatchOptionsencodingbuffe): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
  @scala.inline
  def watch(filename: PathLike, options: BufferEncoding): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  @scala.inline
  def watch(filename: PathLike, options: WatchOptions): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
  
  @scala.inline
  def watch_buffer(filename: PathLike, options: buffer_): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
  
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.`data` can be a string, a `Buffer`, or, an object with an own (not inherited)`toString` function property.
    *
    * The `encoding` option is ignored if `data` is a buffer.
    *
    * If `options` is a string, then it specifies the encoding.
    *
    * The `mode` option only affects the newly created file. See `fs.open()` for more details.
    *
    * Any specified `FileHandle` has to support writing.
    *
    * It is unsafe to use `fsPromises.writeFile()` multiple times on the same file
    * without waiting for the promise to be settled.
    *
    * Similarly to `fsPromises.readFile` \- `fsPromises.writeFile` is a convenience
    * method that performs multiple `write` calls internally to write the buffer
    * passed to it. For performance sensitive code consider using `fs.createWriteStream()`.
    *
    * It is possible to use an `AbortSignal` to cancel an `fsPromises.writeFile()`.
    * Cancelation is "best effort", and some amount of data is likely still
    * to be written.
    *
    * ```js
    * import { writeFile } from 'fs/promises';
    * import { Buffer } from 'buffer';
    *
    * try {
    *   const controller = new AbortController();
    *   const { signal } = controller;
    *   const data = new Uint8Array(Buffer.from('Hello Node.js'));
    *   const promise = writeFile('message.txt', data, { signal });
    *
    *   // Abort the request before the promise settles.
    *   controller.abort();
    *
    *   await promise;
    * } catch (err) {
    *   // When a request is aborted - err is an AbortError
    *   console.error(err);
    * }
    * ```
    *
    * Aborting an ongoing request does not abort individual operating
    * system requests but rather the internal buffering `fs.writeFile` performs.
    * @since v10.0.0
    * @param file filename or `FileHandle`
    * @return Fulfills with `undefined` upon success.
    */
  @scala.inline
  def writeFile(file: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: js.Iterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: AsyncIterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: js.Iterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: AsyncIterable[ArrayBufferView | String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    file: FileHandle,
    data: AsyncIterable[String | ArrayBufferView],
    options: ObjectEncodingOptionsmode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait CreateReadStreamOptions extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var emitClose: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object CreateReadStreamOptions {
    
    @scala.inline
    def apply(): CreateReadStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateReadStreamOptions]
    }
    
    @scala.inline
    implicit class CreateReadStreamOptionsMutableBuilder[Self <: CreateReadStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait CreateWriteStreamOptions extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var emitClose: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object CreateWriteStreamOptions {
    
    @scala.inline
    def apply(): CreateWriteStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateWriteStreamOptions]
    }
    
    @scala.inline
    implicit class CreateWriteStreamOptionsMutableBuilder[Self <: CreateWriteStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      @scala.inline
      def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait FileChangeInfo[T /* <: String | Buffer */] extends StObject {
    
    var eventType: WatchEventType
    
    var filename: T
  }
  object FileChangeInfo {
    
    @scala.inline
    def apply[T /* <: String | Buffer */](eventType: WatchEventType, filename: T): FileChangeInfo[T] = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileChangeInfo[T]]
    }
    
    @scala.inline
    implicit class FileChangeInfoMutableBuilder[Self <: FileChangeInfo[_], T /* <: String | Buffer */] (val x: Self with FileChangeInfo[T]) extends AnyVal {
      
      @scala.inline
      def setEventType(value: WatchEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: T): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  // TODO: Add `EventEmitter` close
  @js.native
  trait FileHandle
    extends StObject
       with _TransferListItem {
    
    /**
      * Alias of `filehandle.writeFile()`.
      *
      * When operating on file handles, the mode cannot be changed from what it was set
      * to with `fsPromises.open()`. Therefore, this is equivalent to `filehandle.writeFile()`.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    def appendFile(data: String): js.Promise[Unit] = js.native
    def appendFile(data: String, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = js.native
    def appendFile(data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def appendFile(data: js.typedarray.Uint8Array, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = js.native
    def appendFile(data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    
    /**
      * Modifies the permissions on the file. See [`chmod(2)`](http://man7.org/linux/man-pages/man2/chmod.2.html).
      * @since v10.0.0
      * @param mode the file mode bit mask.
      * @return Fulfills with `undefined` upon success.
      */
    def chmod(mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Changes the ownership of the file. A wrapper for [`chown(2)`](http://man7.org/linux/man-pages/man2/chown.2.html).
      * @since v10.0.0
      * @param uid The file's new owner's user id.
      * @param gid The file's new group's group id.
      * @return Fulfills with `undefined` upon success.
      */
    def chown(uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Closes the file handle after waiting for any pending operation on the handle to
      * complete.
      *
      * ```js
      * import { open } from 'fs/promises';
      *
      * let filehandle;
      * try {
      *   filehandle = await open('thefile.txt', 'r');
      * } finally {
      *   await filehandle?.close();
      * }
      * ```
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Unlike the 16 kb default `highWaterMark` for a `stream.Readable`, the stream
      * returned by this method has a default `highWaterMark` of 64 kb.
      *
      * `options` can include `start` and `end` values to read a range of bytes from
      * the file instead of the entire file. Both `start` and `end` are inclusive and
      * start counting at 0, allowed values are in the
      * \[0, [`Number.MAX_SAFE_INTEGER`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER)\] range. If `start` is
      * omitted or `undefined`, `filehandle.createReadStream()` reads sequentially from
      * the current file position. The `encoding` can be any one of those accepted by `Buffer`.
      *
      * If the `FileHandle` points to a character device that only supports blocking
      * reads (such as keyboard or sound card), read operations do not finish until data
      * is available. This can prevent the process from exiting and the stream from
      * closing naturally.
      *
      * By default, the stream will emit a `'close'` event after it has been
      * destroyed.  Set the `emitClose` option to `false` to change this behavior.
      *
      * ```js
      * import { open } from 'fs/promises';
      *
      * const fd = await open('/dev/input/event0');
      * // Create a stream from some character device.
      * const stream = fd.createReadStream();
      * setTimeout(() => {
      *   stream.close(); // This may not close the stream.
      *   // Artificially marking end-of-stream, as if the underlying resource had
      *   // indicated end-of-file by itself, allows the stream to close.
      *   // This does not cancel pending read operations, and if there is such an
      *   // operation, the process may still not be able to exit successfully
      *   // until it finishes.
      *   stream.push(null);
      *   stream.read(0);
      * }, 100);
      * ```
      *
      * If `autoClose` is false, then the file descriptor won't be closed, even if
      * there's an error. It is the application's responsibility to close it and make
      * sure there's no file descriptor leak. If `autoClose` is set to true (default
      * behavior), on `'error'` or `'end'` the file descriptor will be closed
      * automatically.
      *
      * An example to read the last 10 bytes of a file which is 100 bytes long:
      *
      * ```js
      * import { open } from 'fs/promises';
      *
      * const fd = await open('sample.txt');
      * fd.createReadStream({ start: 90, end: 99 });
      * ```
      * @since v16.11.0
      */
    def createReadStream(): ReadStream = js.native
    def createReadStream(options: CreateReadStreamOptions): ReadStream = js.native
    
    /**
      * `options` may also include a `start` option to allow writing data at some
      * position past the beginning of the file, allowed values are in the
      * \[0, [`Number.MAX_SAFE_INTEGER`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_SAFE_INTEGER)\] range. Modifying a file rather than replacing
      * it may require the `flags` `open` option to be set to `r+` rather than the
      * default `r`. The `encoding` can be any one of those accepted by `Buffer`.
      *
      * If `autoClose` is set to true (default behavior) on `'error'` or `'finish'`the file descriptor will be closed automatically. If `autoClose` is false,
      * then the file descriptor won't be closed, even if there's an error.
      * It is the application's responsibility to close it and make sure there's no
      * file descriptor leak.
      *
      * By default, the stream will emit a `'close'` event after it has been
      * destroyed.  Set the `emitClose` option to `false` to change this behavior.
      * @since v16.11.0
      */
    def createWriteStream(): WriteStream = js.native
    def createWriteStream(options: CreateWriteStreamOptions): WriteStream = js.native
    
    /**
      * Forces all currently queued I/O operations associated with the file to the
      * operating system's synchronized I/O completion state. Refer to the POSIX [`fdatasync(2)`](http://man7.org/linux/man-pages/man2/fdatasync.2.html) documentation for details.
      *
      * Unlike `filehandle.sync` this method does not flush modified metadata.
      * @since v10.0.0
      * @return Fulfills with `undefined` upon success.
      */
    def datasync(): js.Promise[Unit] = js.native
    
    /**
      * The numeric file descriptor managed by the {FileHandle} object.
      * @since v10.0.0
      */
    val fd: Double = js.native
    
    def read(buffer: js.typedarray.DataView): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.DataView, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.DataView]] = js.native
    def read(buffer: js.typedarray.Float32Array): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float32Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Float32Array]] = js.native
    def read(buffer: js.typedarray.Float64Array): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Float64Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Float64Array]] = js.native
    def read(buffer: js.typedarray.Int16Array): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int16Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int16Array]] = js.native
    def read(buffer: js.typedarray.Int32Array): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int32Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int32Array]] = js.native
    def read(buffer: js.typedarray.Int8Array): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Int8Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Int8Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint16Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint16Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    def read(buffer: js.typedarray.Uint32Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint32Array]] = js.native
    /**
      * Reads data from the file and stores that in the given buffer.
      *
      * If the file is not modified concurrently, the end-of-file is reached when the
      * number of bytes read is zero.
      * @since v10.0.0
      * @param buffer A buffer that will be filled with the file data read.
      * @param offset The location in the buffer at which to start filling.
      * @param length The number of bytes to read.
      * @param position The location where to begin reading data from the file. If `null`, data will be read from the current file position, and the position will be updated. If `position` is an
      * integer, the current file position will remain unchanged.
      * @return Fulfills upon success with an object with two properties:
      */
    def read(buffer: js.typedarray.Uint8Array): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8Array]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Null, length: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Unit, length: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: js.typedarray.Uint8ClampedArray, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[js.typedarray.Uint8ClampedArray]] = js.native
    def read(buffer: BigInt64Array): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Double, length: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Null, length: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Unit, length: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigInt64Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[BigInt64Array]] = js.native
    def read(buffer: BigUint64Array): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Double, length: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Null, length: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Unit, length: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read(buffer: BigUint64Array, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[BigUint64Array]] = js.native
    def read[T /* <: ArrayBufferView */](): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: ArrayBufferView */](options: FileReadOptions[T]): js.Promise[FileReadResult[T]] = js.native
    
    /**
      * Asynchronously reads the entire contents of a file.
      *
      * If `options` is a string, then it specifies the `encoding`.
      *
      * The `FileHandle` has to support reading.
      *
      * If one or more `filehandle.read()` calls are made on a file handle and then a`filehandle.readFile()` call is made, the data will be read from the current
      * position till the end of the file. It doesn't always read from the beginning
      * of the file.
      * @since v10.0.0
      * @return Fulfills upon a successful read with the contents of the file. If no encoding is specified (using `options.encoding`), the data is returned as a {Buffer} object. Otherwise, the
      * data will be a string.
      */
    /**
      * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for reading.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(): js.Promise[Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for reading.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(options: EncodingBufferEncoding): js.Promise[String] = js.native
    def readFile(options: ObjectEncodingOptionsflagFlag): js.Promise[String | Buffer] = js.native
    def readFile(options: `3`): js.Promise[Buffer] = js.native
    def readFile(options: BufferEncoding): js.Promise[String] = js.native
    
    /**
      * Read from a file and write to an array of [ArrayBufferView](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView) s
      * @since v13.13.0, v12.17.0
      * @param position The offset from the beginning of the file where the data should be read from. If `position` is not a `number`, the data will be read from the current position.
      * @return Fulfills upon success an object containing two properties:
      */
    def readv(buffers: js.Array[ArrayBufferView]): js.Promise[ReadVResult] = js.native
    def readv(buffers: js.Array[ArrayBufferView], position: Double): js.Promise[ReadVResult] = js.native
    
    /**
      * @since v10.0.0
      * @return Fulfills with an {fs.Stats} for the file.
      */
    def stat(): js.Promise[Stats] = js.native
    def stat(opts: StatOptionsbigintfalseund): js.Promise[Stats] = js.native
    def stat(opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = js.native
    def stat(opts: StatOptions): js.Promise[Stats | BigIntStats] = js.native
    
    /**
      * Request that all data for the open file descriptor is flushed to the storage
      * device. The specific implementation is operating system and device specific.
      * Refer to the POSIX [`fsync(2)`](http://man7.org/linux/man-pages/man2/fsync.2.html) documentation for more detail.
      * @since v10.0.0
      * @return Fufills with `undefined` upon success.
      */
    def sync(): js.Promise[Unit] = js.native
    
    /**
      * Truncates the file.
      *
      * If the file was larger than `len` bytes, only the first `len` bytes will be
      * retained in the file.
      *
      * The following example retains only the first four bytes of the file:
      *
      * ```js
      * import { open } from 'fs/promises';
      *
      * let filehandle = null;
      * try {
      *   filehandle = await open('temp.txt', 'r+');
      *   await filehandle.truncate(4);
      * } finally {
      *   await filehandle?.close();
      * }
      * ```
      *
      * If the file previously was shorter than `len` bytes, it is extended, and the
      * extended part is filled with null bytes (`'\0'`):
      *
      * If `len` is negative then `0` will be used.
      * @since v10.0.0
      * @param [len=0]
      * @return Fulfills with `undefined` upon success.
      */
    def truncate(): js.Promise[Unit] = js.native
    def truncate(len: Double): js.Promise[Unit] = js.native
    
    /**
      * Change the file system timestamps of the object referenced by the `FileHandle` then resolves the promise with no arguments upon success.
      * @since v10.0.0
      */
    def utimes(atime: String, mtime: String): js.Promise[Unit] = js.native
    def utimes(atime: String, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(atime: String, mtime: Double): js.Promise[Unit] = js.native
    def utimes(atime: js.Date, mtime: String): js.Promise[Unit] = js.native
    def utimes(atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: String): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: Double): js.Promise[Unit] = js.native
    
    def write(data: String): js.Promise[BytesWritten] = js.native
    def write(data: String, position: Double): js.Promise[BytesWritten] = js.native
    def write(data: String, position: Double, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    def write(data: String, position: Null, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    def write(data: String, position: Unit, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    /**
      * Write `buffer` to the file.
      *
      * If `buffer` is a plain object, it must have an own (not inherited) `toString`function property.
      *
      * The promise is resolved with an object containing two properties:
      *
      * It is unsafe to use `filehandle.write()` multiple times on the same file
      * without waiting for the promise to be resolved (or rejected). For this
      * scenario, use `fs.createWriteStream()`.
      *
      * On Linux, positional writes do not work when the file is opened in append mode.
      * The kernel ignores the position argument and always appends the data to
      * the end of the file.
      * @since v10.0.0
      * @param [offset=0] The start position from within `buffer` where the data to write begins.
      * @param [length=buffer.byteLength] The number of bytes from `buffer` to write.
      * @param position The offset from the beginning of the file where the data from `buffer` should be written. If `position` is not a `number`, the data will be written at the current position.
      * See the POSIX pwrite(2) documentation for more detail.
      */
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[tmttyped.node.anon.Buffer[TBuffer]] = js.native
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists.`data` can be a string, a buffer, an
      * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface) or
      * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object, or an
      * object with an own `toString` function
      * property. The promise is resolved with no arguments upon success.
      *
      * If `options` is a string, then it specifies the `encoding`.
      *
      * The `FileHandle` has to support writing.
      *
      * It is unsafe to use `filehandle.writeFile()` multiple times on the same file
      * without waiting for the promise to be resolved (or rejected).
      *
      * If one or more `filehandle.write()` calls are made on a file handle and then a`filehandle.writeFile()` call is made, the data will be written from the
      * current position till the end of the file. It doesn't always write from the
      * beginning of the file.
      * @since v10.0.0
      */
    def writeFile(data: String): js.Promise[Unit] = js.native
    def writeFile(data: String, options: ObjectEncodingOptions with FlagAndOpenMode with Abortable): js.Promise[Unit] = js.native
    def writeFile(data: String, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def writeFile(data: js.typedarray.Uint8Array, options: ObjectEncodingOptions with FlagAndOpenMode with Abortable): js.Promise[Unit] = js.native
    def writeFile(data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    
    /**
      * Write an array of [ArrayBufferView](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView) s to the file.
      *
      * The promise is resolved with an object containing a two properties:
      *
      * It is unsafe to call `writev()` multiple times on the same file without waiting
      * for the promise to be resolved (or rejected).
      *
      * On Linux, positional writes don't work when the file is opened in append mode.
      * The kernel ignores the position argument and always appends the data to
      * the end of the file.
      * @since v12.9.0
      * @param position The offset from the beginning of the file where the data from `buffers` should be written. If `position` is not a `number`, the data will be written at the current
      * position.
      */
    def writev(buffers: js.Array[ArrayBufferView]): js.Promise[WriteVResult] = js.native
    def writev(buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WriteVResult] = js.native
  }
  
  trait FileReadOptions[T /* <: ArrayBufferView */] extends StObject {
    
    /**
      * @default `Buffer.alloc(0xffff)`
      */
    var buffer: js.UndefOr[T] = js.undefined
    
    /**
      * @default `buffer.byteLength`
      */
    var length: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * @default 0
      */
    var offset: js.UndefOr[Double | Null] = js.undefined
    
    var position: js.UndefOr[Double | Null] = js.undefined
  }
  object FileReadOptions {
    
    @scala.inline
    def apply[T /* <: ArrayBufferView */](): FileReadOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileReadOptions[T]]
    }
    
    @scala.inline
    implicit class FileReadOptionsMutableBuilder[Self <: FileReadOptions[_], T /* <: ArrayBufferView */] (val x: Self with FileReadOptions[T]) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: T): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthNull: Self = StObject.set(x, "length", null)
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetNull: Self = StObject.set(x, "offset", null)
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionNull: Self = StObject.set(x, "position", null)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait FileReadResult[T /* <: ArrayBufferView */] extends StObject {
    
    var buffer: T
    
    var bytesRead: Double
  }
  object FileReadResult {
    
    @scala.inline
    def apply[T /* <: ArrayBufferView */](buffer: T, bytesRead: Double): FileReadResult[T] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileReadResult[T]]
    }
    
    @scala.inline
    implicit class FileReadResultMutableBuilder[Self <: FileReadResult[_], T /* <: ArrayBufferView */] (val x: Self with FileReadResult[T]) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: T): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlagAndOpenMode extends StObject {
    
    var flag: js.UndefOr[OpenMode] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
  }
  object FlagAndOpenMode {
    
    @scala.inline
    def apply(): FlagAndOpenMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagAndOpenMode]
    }
    
    @scala.inline
    implicit class FlagAndOpenModeMutableBuilder[Self <: FlagAndOpenMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
