package tmttyped.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fsMod {
  
  type Mode = scala.Double | java.lang.String
  
  type NoParamCallback = js.Function1[/* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, scala.Unit]
  
  type OpenMode = scala.Double | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - tmttyped.node.Buffer
    - tmttyped.node.nodeUrlMod.URL
  */
  type PathLike = tmttyped.node.fsMod._PathLike | java.lang.String
  
  type WriteFileOptions = tmttyped.node.anon.BaseEncodingOptionsmodeMoEncoding | java.lang.String | scala.Null
  
  @scala.inline
  def access(path: tmttyped.node.fsMod.PathLike, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def access(
    path: tmttyped.node.fsMod.PathLike,
    mode: js.UndefOr[scala.Nothing],
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def access(
    path: tmttyped.node.fsMod.PathLike,
    mode: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def accessSync(path: tmttyped.node.fsMod.PathLike): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def accessSync(path: tmttyped.node.fsMod.PathLike, mode: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFile(file: scala.Double, data: java.lang.String, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: java.lang.String,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(file: scala.Double, data: js.typedarray.Uint8Array, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: scala.Double,
    data: js.typedarray.Uint8Array,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: tmttyped.node.fsMod.PathLike,
    data: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: tmttyped.node.fsMod.PathLike,
    data: java.lang.String,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: tmttyped.node.fsMod.PathLike,
    data: js.typedarray.Uint8Array,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFile(
    file: tmttyped.node.fsMod.PathLike,
    data: js.typedarray.Uint8Array,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: java.lang.String, options: tmttyped.node.fsMod.WriteFileOptions): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: js.typedarray.Uint8Array): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: scala.Double, data: js.typedarray.Uint8Array, options: tmttyped.node.fsMod.WriteFileOptions): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: tmttyped.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: tmttyped.node.fsMod.PathLike,
    data: java.lang.String,
    options: tmttyped.node.fsMod.WriteFileOptions
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(file: tmttyped.node.fsMod.PathLike, data: js.typedarray.Uint8Array): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def appendFileSync(
    file: tmttyped.node.fsMod.PathLike,
    data: js.typedarray.Uint8Array,
    options: tmttyped.node.fsMod.WriteFileOptions
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmod(
    path: tmttyped.node.fsMod.PathLike,
    mode: tmttyped.node.fsMod.Mode,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chmodSync(path: tmttyped.node.fsMod.PathLike, mode: tmttyped.node.fsMod.Mode): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chown(
    path: tmttyped.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def chownSync(path: tmttyped.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def close(fd: scala.Double, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def closeSync(fd: scala.Double): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFile(
    src: tmttyped.node.fsMod.PathLike,
    dest: tmttyped.node.fsMod.PathLike,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFile(
    src: tmttyped.node.fsMod.PathLike,
    dest: tmttyped.node.fsMod.PathLike,
    flags: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def copyFileSync(src: tmttyped.node.fsMod.PathLike, dest: tmttyped.node.fsMod.PathLike): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def copyFileSync(src: tmttyped.node.fsMod.PathLike, dest: tmttyped.node.fsMod.PathLike, flags: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def createReadStream(path: tmttyped.node.fsMod.PathLike): tmttyped.node.fsMod.ReadStream = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: tmttyped.node.fsMod.PathLike, options: java.lang.String): tmttyped.node.fsMod.ReadStream = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.AutoClose): tmttyped.node.fsMod.ReadStream = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.ReadStream]
  
  @scala.inline
  def createWriteStream(path: tmttyped.node.fsMod.PathLike): tmttyped.node.fsMod.WriteStream = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: tmttyped.node.fsMod.PathLike, options: java.lang.String): tmttyped.node.fsMod.WriteStream = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.EmitClose): tmttyped.node.fsMod.WriteStream = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.WriteStream]
  
  @scala.inline
  def exists(path: tmttyped.node.fsMod.PathLike, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def existsSync(path: tmttyped.node.fsMod.PathLike): scala.Boolean = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def fchmod(fd: scala.Double, mode: tmttyped.node.fsMod.Mode, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchmodSync(fd: scala.Double, mode: tmttyped.node.fsMod.Mode): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasync(fd: scala.Double, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fdatasyncSync(fd: scala.Double): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstat(
    fd: scala.Double,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fstat(
    fd: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.fsMod.BigIntStats | tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fstat(
    fd: scala.Double,
    options: tmttyped.node.anon.StatOptionsbigintfalseund,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fstat(
    fd: scala.Double,
    options: tmttyped.node.anon.StatOptionsbiginttrue,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def fstat(
    fd: scala.Double,
    options: tmttyped.node.fsMod.StatOptions,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fstatSync(fd: scala.Double): tmttyped.node.fsMod.Stats = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.Stats]
  @scala.inline
  def fstatSync(fd: scala.Double, options: tmttyped.node.anon.StatOptionsbigintfalseund): tmttyped.node.fsMod.Stats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.Stats]
  @scala.inline
  def fstatSync(fd: scala.Double, options: tmttyped.node.anon.StatOptionsbiginttrue): tmttyped.node.fsMod.BigIntStats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.BigIntStats]
  @scala.inline
  def fstatSync(fd: scala.Double, options: tmttyped.node.fsMod.StatOptions): tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats]
  
  @scala.inline
  def fstatSync_Union(fd: scala.Double): tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats]
  
  @scala.inline
  def fsync(fd: scala.Double, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def fsyncSync(fd: scala.Double): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncate(fd: scala.Double, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: js.UndefOr[scala.Nothing], callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: scala.Double, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncate(fd: scala.Double, len: scala.Null, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ftruncateSync(fd: scala.Double): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: js.Date,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(fd: scala.Double, atime: js.Date, mtime: js.Date, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: js.Date,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: js.Date, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmod(
    path: tmttyped.node.fsMod.PathLike,
    mode: tmttyped.node.fsMod.Mode,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchmodSync(path: tmttyped.node.fsMod.PathLike, mode: tmttyped.node.fsMod.Mode): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchown(
    path: tmttyped.node.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lchownSync(path: tmttyped.node.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def link(
    existingPath: tmttyped.node.fsMod.PathLike,
    newPath: tmttyped.node.fsMod.PathLike,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def linkSync(existingPath: tmttyped.node.fsMod.PathLike, newPath: tmttyped.node.fsMod.PathLike): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstat(
    path: tmttyped.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lstat(
    path: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.fsMod.BigIntStats | tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lstat(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.StatOptionsbigintfalseund,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lstat(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.StatOptionsbiginttrue,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lstat(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.fsMod.StatOptions,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lstatSync(path: tmttyped.node.fsMod.PathLike): tmttyped.node.fsMod.Stats = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.Stats]
  @scala.inline
  def lstatSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.StatOptionsbigintfalseund): tmttyped.node.fsMod.Stats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.Stats]
  @scala.inline
  def lstatSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.StatOptionsbiginttrue): tmttyped.node.fsMod.BigIntStats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.BigIntStats]
  @scala.inline
  def lstatSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.StatOptions): tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats]
  
  @scala.inline
  def lstatSync_Union(path: tmttyped.node.fsMod.PathLike): tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats]
  
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: js.Date,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: js.Date,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: java.lang.String, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: js.Date, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: js.Date, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: js.Date, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: scala.Double, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def lutimesSync(path: tmttyped.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdir(path: tmttyped.node.fsMod.PathLike, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[tmttyped.node.fsMod.Mode],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[tmttyped.node.fsMod.Mode],
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: tmttyped.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: tmttyped.node.fsMod.PathLike,
    options: scala.Null,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.MakeDirectoryOptionsrecurMode,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.MakeDirectoryOptionsrecur,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.fsMod.MakeDirectoryOptions,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* path */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdirSync(path: tmttyped.node.fsMod.PathLike): js.UndefOr[java.lang.String] = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.MakeDirectoryOptionsrecur): js.UndefOr[java.lang.String] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.MakeDirectoryOptionsrecurMode): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.MakeDirectoryOptions): js.UndefOr[java.lang.String] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.Mode): js.UndefOr[java.lang.String] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def mkdirSync_Unit(path: tmttyped.node.fsMod.PathLike): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdirSync_Unit(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.Mode): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: scala.Null,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: tmttyped.node.BufferEncoding,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: tmttyped.node.anon.`2`,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: tmttyped.node.fsMod.BaseEncodingOptions,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* folder */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: tmttyped.node.nodeStrings.buffer_,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* folder */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def mkdtempSync(prefix: java.lang.String): java.lang.String = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: java.lang.String): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: tmttyped.node.BufferEncoding): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: tmttyped.node.fsMod.BaseEncodingOptions): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: tmttyped.node.fsMod.BufferEncodingOption): tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String): java.lang.String | tmttyped.node.Buffer = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String, options: tmttyped.node.fsMod.BaseEncodingOptions): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  
  @scala.inline
  def open(
    path: tmttyped.node.fsMod.PathLike,
    flags: tmttyped.node.fsMod.OpenMode,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(
    path: tmttyped.node.fsMod.PathLike,
    flags: tmttyped.node.fsMod.OpenMode,
    mode: js.UndefOr[tmttyped.node.fsMod.Mode],
    callback: js.Function2[tmttyped.node.NodeJS.ErrnoException | scala.Null, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def open(
    path: tmttyped.node.fsMod.PathLike,
    flags: tmttyped.node.fsMod.OpenMode,
    mode: scala.Null,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* fd */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def openSync(path: tmttyped.node.fsMod.PathLike, flags: tmttyped.node.fsMod.OpenMode): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def openSync(
    path: tmttyped.node.fsMod.PathLike,
    flags: tmttyped.node.fsMod.OpenMode,
    mode: tmttyped.node.fsMod.Mode
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def opendir(
    path: java.lang.String,
    cb: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ tmttyped.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def opendir(
    path: java.lang.String,
    options: tmttyped.node.fsMod.OpenDirOptions,
    cb: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* dir */ tmttyped.node.fsMod.Dir, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def opendirSync(path: java.lang.String): tmttyped.node.fsMod.Dir = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.Dir]
  @scala.inline
  def opendirSync(path: java.lang.String, options: tmttyped.node.fsMod.OpenDirOptions): tmttyped.node.fsMod.Dir = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.Dir]
  
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def read(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFile(
    path: scala.Double,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: java.lang.String,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: scala.Null,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: tmttyped.node.anon.BaseEncodingOptionsflagst,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: tmttyped.node.anon.EncodingBufferEncoding,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: scala.Double,
    options: tmttyped.node.anon.`3`,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: tmttyped.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: tmttyped.node.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: tmttyped.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.BaseEncodingOptionsflagst,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.EncodingBufferEncoding,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readFile(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.`3`,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* data */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readFileSync(path: scala.Double): tmttyped.node.Buffer = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: tmttyped.node.BufferEncoding): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: tmttyped.node.anon.BaseEncodingOptionsflagst): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def readFileSync(path: scala.Double, options: tmttyped.node.anon.EncodingBufferEncoding): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: scala.Double, options: tmttyped.node.anon.`3`): tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def readFileSync(path: tmttyped.node.fsMod.PathLike): tmttyped.node.Buffer = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.Buffer]
  @scala.inline
  def readFileSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.BufferEncoding): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.BaseEncodingOptionsflagst): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def readFileSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.EncodingBufferEncoding): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.`3`): tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def readFileSync_Union(path: scala.Double): java.lang.String | tmttyped.node.Buffer = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def readFileSync_Union(path: scala.Double, options: tmttyped.node.BufferEncoding): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def readFileSync_Union(path: tmttyped.node.fsMod.PathLike): java.lang.String | tmttyped.node.Buffer = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def readFileSync_Union(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.BufferEncoding): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  
  @scala.inline
  def readSync(fd: scala.Double, buffer: tmttyped.node.NodeJS.ArrayBufferView): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    opts: tmttyped.node.fsMod.ReadSyncOptions
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[tmttyped.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[tmttyped.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.BufferEncoding,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[tmttyped.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.BaseEncodingOptionswithFiEncoding,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[tmttyped.node.fsMod.Dirent], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.BaseEncodingOptionswithFi,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[tmttyped.node.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.Encoding,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[tmttyped.node.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.WithFileTypes,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.nodeStrings.buffer_,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* files */ js.Array[tmttyped.node.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readdirSync(path: tmttyped.node.fsMod.PathLike): js.Array[java.lang.String] = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.BufferEncoding): js.Array[java.lang.String] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.BaseEncodingOptionswithFi): js.Array[tmttyped.node.Buffer | java.lang.String] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[tmttyped.node.Buffer | java.lang.String]]
  @scala.inline
  def readdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.BaseEncodingOptionswithFiEncoding): js.Array[tmttyped.node.fsMod.Dirent] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[tmttyped.node.fsMod.Dirent]]
  @scala.inline
  def readdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.Encoding): js.Array[tmttyped.node.Buffer] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[tmttyped.node.Buffer]]
  @scala.inline
  def readdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.WithFileTypes): js.Array[java.lang.String] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def readdirSync_buffer(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.nodeStrings.buffer_): js.Array[tmttyped.node.Buffer] = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[tmttyped.node.Buffer]]
  
  @scala.inline
  def readlink(
    path: tmttyped.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: tmttyped.node.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: tmttyped.node.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.BufferEncoding,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.fsMod.BaseEncodingOptions,
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.Buffer | (/* linkString */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readlink(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.fsMod.BufferEncodingOption,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* linkString */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readlinkSync(path: tmttyped.node.fsMod.PathLike): java.lang.String = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: tmttyped.node.fsMod.PathLike, options: java.lang.String): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def readlinkSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.BufferEncoding): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.BaseEncodingOptions): java.lang.String = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.BufferEncodingOption): tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.Buffer]
  
  @scala.inline
  def readlinkSync_Union(path: tmttyped.node.fsMod.PathLike): java.lang.String | tmttyped.node.Buffer = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  @scala.inline
  def readlinkSync_Union(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.BaseEncodingOptions): java.lang.String | tmttyped.node.Buffer = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | tmttyped.node.Buffer]
  
  @scala.inline
  def readv(
    fd: scala.Double,
    buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView],
    cb: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffers */ js.Array[tmttyped.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def readv(
    fd: scala.Double,
    buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView],
    position: scala.Double,
    cb: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesRead */ scala.Double, 
      /* buffers */ js.Array[tmttyped.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def readvSync(fd: scala.Double, buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView]): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def readvSync(fd: scala.Double, buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView], position: scala.Double): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def rename(
    oldPath: tmttyped.node.fsMod.PathLike,
    newPath: tmttyped.node.fsMod.PathLike,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def renameSync(oldPath: tmttyped.node.fsMod.PathLike, newPath: tmttyped.node.fsMod.PathLike): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rm(path: tmttyped.node.fsMod.PathLike, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def rm(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.fsMod.RmOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmSync(path: tmttyped.node.fsMod.PathLike): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.RmOptions): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdir(path: tmttyped.node.fsMod.PathLike, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def rmdir(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.fsMod.RmDirOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def rmdirSync(path: tmttyped.node.fsMod.PathLike): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def rmdirSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.RmDirOptions): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def stat(
    path: tmttyped.node.fsMod.PathLike,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      tmttyped.node.fsMod.BigIntStats | tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.StatOptionsbigintfalseund,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.StatOptionsbiginttrue,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def stat(
    path: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.fsMod.StatOptions,
    callback: js.Function2[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* stats */ tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def statSync(path: tmttyped.node.fsMod.PathLike): tmttyped.node.fsMod.Stats = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.Stats]
  @scala.inline
  def statSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.StatOptionsbigintfalseund): tmttyped.node.fsMod.Stats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.Stats]
  @scala.inline
  def statSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.StatOptionsbiginttrue): tmttyped.node.fsMod.BigIntStats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.BigIntStats]
  @scala.inline
  def statSync(path: tmttyped.node.fsMod.PathLike, options: tmttyped.node.fsMod.StatOptions): tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats]
  
  @scala.inline
  def statSync_Union(path: tmttyped.node.fsMod.PathLike): tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.Stats | tmttyped.node.fsMod.BigIntStats]
  
  @scala.inline
  def symlinkSync(target: tmttyped.node.fsMod.PathLike, path: tmttyped.node.fsMod.PathLike): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def symlinkSync(
    target: tmttyped.node.fsMod.PathLike,
    path: tmttyped.node.fsMod.PathLike,
    `type`: tmttyped.node.fsMod.symlink.Type
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncate(path: tmttyped.node.fsMod.PathLike, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(
    path: tmttyped.node.fsMod.PathLike,
    len: js.UndefOr[scala.Nothing],
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(
    path: tmttyped.node.fsMod.PathLike,
    len: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def truncate(path: tmttyped.node.fsMod.PathLike, len: scala.Null, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def truncateSync(path: tmttyped.node.fsMod.PathLike): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def truncateSync(path: tmttyped.node.fsMod.PathLike, len: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlink(path: tmttyped.node.fsMod.PathLike, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unlinkSync(path: tmttyped.node.fsMod.PathLike): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unwatchFile(filename: tmttyped.node.fsMod.PathLike): scala.Unit = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def unwatchFile(
    filename: tmttyped.node.fsMod.PathLike,
    listener: js.Function2[
      /* curr */ tmttyped.node.fsMod.Stats, 
      /* prev */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: js.Date,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: js.Date,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: js.Date,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: js.Date,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimes(
    path: tmttyped.node.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: java.lang.String, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: js.Date, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: js.Date, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: js.Date, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: scala.Double, mtime: js.Date): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def utimesSync(path: tmttyped.node.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch(filename: tmttyped.node.fsMod.PathLike): tmttyped.node.fsMod.FSWatcher = tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    listener: js.Function2[
      /* event */ tmttyped.node.nodeStrings.rename | tmttyped.node.nodeStrings.change, 
      /* filename */ java.lang.String, 
      _
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* event */ tmttyped.node.nodeStrings.rename | tmttyped.node.nodeStrings.change, 
      /* filename */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: tmttyped.node.fsMod.PathLike, options: java.lang.String): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    options: java.lang.String,
    listener: js.Function2[
      /* event */ tmttyped.node.nodeStrings.rename | tmttyped.node.nodeStrings.change, 
      /* filename */ java.lang.String | tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    options: scala.Null,
    listener: js.Function2[
      tmttyped.node.nodeStrings.change | tmttyped.node.nodeStrings.rename, 
      tmttyped.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: tmttyped.node.fsMod.PathLike, options: tmttyped.node.BufferEncoding): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.BufferEncoding,
    listener: js.Function2[
      /* event */ tmttyped.node.nodeStrings.rename | tmttyped.node.nodeStrings.change, 
      /* filename */ java.lang.String, 
      scala.Unit
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.Persistent): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.Persistent,
    listener: js.Function2[
      tmttyped.node.nodeStrings.change | tmttyped.node.nodeStrings.rename, 
      tmttyped.node.Buffer | (/* filename */ java.lang.String), 
      scala.Unit
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(filename: tmttyped.node.fsMod.PathLike, options: tmttyped.node.anon.Recursive): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.Recursive,
    listener: js.Function2[
      /* event */ tmttyped.node.nodeStrings.rename | tmttyped.node.nodeStrings.change, 
      /* filename */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  @scala.inline
  def watch(
    filename: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.nodeStrings.buffer_,
    listener: js.Function2[
      /* event */ tmttyped.node.nodeStrings.rename | tmttyped.node.nodeStrings.change, 
      /* filename */ tmttyped.node.Buffer, 
      scala.Unit
    ]
  ): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  
  @scala.inline
  def watchFile(
    filename: tmttyped.node.fsMod.PathLike,
    listener: js.Function2[
      /* curr */ tmttyped.node.fsMod.Stats, 
      /* prev */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: tmttyped.node.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[
      /* curr */ tmttyped.node.fsMod.Stats, 
      /* prev */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def watchFile(
    filename: tmttyped.node.fsMod.PathLike,
    options: tmttyped.node.anon.Interval,
    listener: js.Function2[
      /* curr */ tmttyped.node.fsMod.Stats, 
      /* prev */ tmttyped.node.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def watch_buffer(filename: tmttyped.node.fsMod.PathLike, options: tmttyped.node.nodeStrings.buffer_): tmttyped.node.fsMod.FSWatcher = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[tmttyped.node.fsMod.FSWatcher]
  
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.DataView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.DataView, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Float64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Float64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Int8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Int8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint16Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint32Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigInt64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigInt64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Double,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Null,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    buffer: tmttyped.std.BigUint64Array,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* buffer */ tmttyped.std.BigUint64Array, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: tmttyped.node.BufferEncoding,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: tmttyped.node.BufferEncoding,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def write(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: tmttyped.node.BufferEncoding,
    callback: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFile(path: scala.Double, data: java.lang.String, callback: tmttyped.node.fsMod.NoParamCallback): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: java.lang.String,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: scala.Double,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: tmttyped.node.fsMod.PathLike,
    data: java.lang.String,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: tmttyped.node.fsMod.PathLike,
    data: java.lang.String,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: tmttyped.node.fsMod.PathLike,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFile(
    path: tmttyped.node.fsMod.PathLike,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    options: tmttyped.node.fsMod.WriteFileOptions,
    callback: tmttyped.node.fsMod.NoParamCallback
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: java.lang.String, options: tmttyped.node.fsMod.WriteFileOptions): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: scala.Double, data: tmttyped.node.NodeJS.ArrayBufferView): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: scala.Double,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    options: tmttyped.node.fsMod.WriteFileOptions
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: tmttyped.node.fsMod.PathLike, data: java.lang.String): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: tmttyped.node.fsMod.PathLike,
    data: java.lang.String,
    options: tmttyped.node.fsMod.WriteFileOptions
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(path: tmttyped.node.fsMod.PathLike, data: tmttyped.node.NodeJS.ArrayBufferView): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writeFileSync(
    path: tmttyped.node.fsMod.PathLike,
    data: tmttyped.node.NodeJS.ArrayBufferView,
    options: tmttyped.node.fsMod.WriteFileOptions
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writeSync(fd: scala.Double, buffer: tmttyped.node.NodeJS.ArrayBufferView): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, buffer: tmttyped.node.NodeJS.ArrayBufferView, offset: scala.Double): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    buffer: tmttyped.node.NodeJS.ArrayBufferView,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: js.UndefOr[scala.Nothing],
    encoding: tmttyped.node.BufferEncoding
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(fd: scala.Double, string: java.lang.String, position: scala.Double): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Double,
    encoding: tmttyped.node.BufferEncoding
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writeSync(
    fd: scala.Double,
    string: java.lang.String,
    position: scala.Null,
    encoding: tmttyped.node.BufferEncoding
  ): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def writev(
    fd: scala.Double,
    buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView],
    cb: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesWritten */ scala.Double, 
      /* buffers */ js.Array[tmttyped.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def writev(
    fd: scala.Double,
    buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView],
    position: scala.Double,
    cb: js.Function3[
      /* err */ tmttyped.node.NodeJS.ErrnoException | scala.Null, 
      /* bytesWritten */ scala.Double, 
      /* buffers */ js.Array[tmttyped.node.NodeJS.ArrayBufferView], 
      scala.Unit
    ]
  ): scala.Unit = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def writevSync(fd: scala.Double, buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView]): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  @scala.inline
  def writevSync(fd: scala.Double, buffers: js.Array[tmttyped.node.NodeJS.ArrayBufferView], position: scala.Double): scala.Double = (tmttyped.node.fsMod.^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
}
