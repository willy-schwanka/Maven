// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/assistant/embedded/v1alpha2/embedded_assistant.proto

package com.google.assistant.embedded.v1alpha2;

public interface DeviceLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.assistant.embedded.v1alpha2.DeviceLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Latitude and longitude of device.
   * </pre>
   *
   * <code>.google.type.LatLng coordinates = 1;</code>
   */
  boolean hasCoordinates();
  /**
   * <pre>
   * Latitude and longitude of device.
   * </pre>
   *
   * <code>.google.type.LatLng coordinates = 1;</code>
   */
  com.google.type.LatLng getCoordinates();
  /**
   * <pre>
   * Latitude and longitude of device.
   * </pre>
   *
   * <code>.google.type.LatLng coordinates = 1;</code>
   */
  com.google.type.LatLngOrBuilder getCoordinatesOrBuilder();

  public com.google.assistant.embedded.v1alpha2.DeviceLocation.TypeCase getTypeCase();
}
