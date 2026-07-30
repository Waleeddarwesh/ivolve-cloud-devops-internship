output "instance_id" {
  description = "The ID of the EC2 instance"
  value       = aws_instance.db_server.id
}

output "public_ip" {
  description = "The public IP address of the EC2 instance"
  value       = aws_instance.db_server.public_ip
}

output "instance_tags" {
  description = "Tags applied to the instance"
  value       = aws_instance.db_server.tags
}
