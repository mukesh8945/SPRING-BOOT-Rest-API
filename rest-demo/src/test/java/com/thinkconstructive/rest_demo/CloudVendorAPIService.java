package com.thinkconstructive.rest_demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

	CloudVendor cloudVendor;

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId)

	{
		return cloudVendor;
//        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
	}

//  Post Mapping
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully";

	}

//  Put Mapping
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Updated Successfully";

	}
	
//	Delete Mapping
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId)
	{
		this.cloudVendor = null;
		return "Cloud Vendor Deleted Successfully";
	}
}
