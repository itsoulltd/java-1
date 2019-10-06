// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.tensorflow.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.c_api.global.tensorflow.*;


// --------------------------------------------------------------------------
// C API for TensorFlow Kernels.
//
// This API allows developers to register custom kernel implementations for
// TensorFlow.
//
// See c_api.h header comments for a discussion about API conventions.
//
// Users wishing to extend TensorFlow with new kernels will call
// `TF_NewKernelBuilder`. The resulting kernel builder can be registered with
// `TF_RegisterKernelBuilder`, which will allow TF to construct user-provided
// kernels when necessary.

@Opaque @Properties(inherit = org.tensorflow.c_api.presets.tensorflow.class)
public class TF_KernelBuilder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_KernelBuilder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_KernelBuilder(Pointer p) { super(p); }
}