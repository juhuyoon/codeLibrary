import React from "react";

const Row = props =>
  <div className={`row${props.fluid ? "-fluid" : ""}`} {...props} />;

export default Row;
