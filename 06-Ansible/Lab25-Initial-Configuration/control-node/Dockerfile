FROM ubuntu:22.04

RUN apt-get update && apt-get install -y \
    ansible \
    openssh-client \
    sshpass \
    iputils-ping \
    && rm -rf /var/lib/apt/lists/*

# Create workspace directory
RUN mkdir -p /ansible-lab

WORKDIR /ansible-lab

# Keep container running
CMD ["sleep", "infinity"]
